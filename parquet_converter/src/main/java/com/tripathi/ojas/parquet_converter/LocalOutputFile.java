package com.tripathi.ojas.parquet_converter;

import org.apache.parquet.io.OutputFile;
import org.apache.parquet.io.PositionOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LocalOutputFile implements OutputFile {
    private final File file;
    public LocalOutputFile(File file) {
        this.file = file;
    }
    @Override
    public PositionOutputStream create(long blockSizeHint) throws IOException {
        return new PositionOutputStream() {
            private final OutputStream out = new FileOutputStream(file);
            private long position = 0;
            @Override
            public void write(int b) throws IOException {
                out.write(b);
                position++;
            }
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                out.write(b, off, len);
                position += len;
            }
            @Override
            public long getPos() {
                return position;
            }
            @Override
            public void close() throws IOException {
                out.close();
            }
        };
    }
    @Override
    public PositionOutputStream createOrOverwrite(long blockSizeHint) throws IOException {
        return create(blockSizeHint);
    }
    @Override
    public boolean supportsBlockSize() {
        return false;
    }
    @Override
    public long defaultBlockSize() {
        return 0;
    }
}