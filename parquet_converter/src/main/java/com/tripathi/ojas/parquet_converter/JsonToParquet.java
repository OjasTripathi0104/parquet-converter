package com.tripathi.ojas.parquet_converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;
import org.apache.parquet.io.OutputFile;
import java.io.File;

public class JsonToParquet {
    private static final String INPUT_JSON_PATH = "src/main/resources/dummy.json";
    private static final String OUTPUT_PARQUET_PATH = "output/dummy_packet.parquet";
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File(INPUT_JSON_PATH);
        JsonNode rootNode = mapper.readTree(inputFile);
        String schemaStr = "{\n" +
                "\"type\": \"record\",\n" +
                "\"name\": \"RecordEntry\",\n" +
                "\"fields\": [\n" +
                "{\"name\": \"accountId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"acctNumber\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"acquirerBIN\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"acquirerCountryCode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"acquirerMerchantID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"acsTransID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"acsTxnId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"action\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"addrMatch\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"async\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"authenticationType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browser_browserName\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browser_browserNameVersion\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browser_deviceType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browser_language\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browser_operatingSystem\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browser_osName\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"browserUserAgent\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cardDeliveryDate\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cardExpiryDate\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cardholderName\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cardNo\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cardType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cardUnionType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"caseAction\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"caseAssignedUser\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"caseStatus\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"cdnDeviceId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"challengeType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"channelId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"city\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"clientId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"consentId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"created\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"currencyRateApplied\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"custBankAcctNumber\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"details\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"deviceChannel\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"deviceId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"deviceInfo\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"deviceRenderOptions\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"digiCardInd\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"dsReferenceNumber\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"dsTransID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"dsURL\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ebean\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"emailId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"final_transaction_status\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"finalStatus\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"instanceId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_areacode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_city\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_country_long\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_domain\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_elevation\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_iddcode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_isp\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_latitude\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_longitude\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_mcc\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_mnc\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_mobilebrand\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_netspeed\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_region\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_status\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_timezone\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_usagetype\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_weatherstationcode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_weatherstationname\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"ip_zipcode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"isCase\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"isFirstRequest\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"issuerBinLength\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"issuerCountryCode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"lastDrop\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"mcc\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantCity\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantCountry\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantCountryCode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantFraudRate\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantId\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantName\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"merchantPageTxn\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"messageCategory\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"messageExtension\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"messageType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"messageVersion\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"mobileNo\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"partRequest\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"payTokenInd\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"pinCode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"policyEngineReq\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"profileFlags\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"purchaseAmount\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"purchaseCurrency\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"purchaseCurrencyCode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"purchaseDate\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"purchaseExponent\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"rating\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"reason\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"remarks\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"rrn\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sdkAppID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sdkEphemPubKey\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sdkMaxTimeout\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sdkReferenceNumber\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sdkTransID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sourceAmount\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"sourceCurrencyCode\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"state\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"suggestion\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDsMcc\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSRequestorAuthenticationInd\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSRequestorChallengeInd\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSRequestorID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSRequestorName\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSRequestorURL\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSServerOperatorID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSServerRefNumber\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSServerTransID\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"threeDSServerURL\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"timeStamp\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"transType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"txnSourceType\", \"type\": [\"null\", \"string\"], \"default\": null},\n" +
                "{\"name\": \"txnType\", \"type\": [\"null\", \"string\"], \"default\": null}\n" +
                "]\n" +
                "}";
        Schema schema = new Schema.Parser().parse(schemaStr);
        File outputFile = new File(OUTPUT_PARQUET_PATH);
        outputFile.getParentFile().mkdirs();
        OutputFile localOutputFile = new LocalOutputFile(outputFile);
        ParquetWriter<GenericRecord> writer = AvroParquetWriter
                .<GenericRecord>builder(localOutputFile)
                .withSchema(schema)
                .withCompressionCodec(CompressionCodecName.SNAPPY)
                .build();
        System.out.println("Writing rows to Parquet...");
        GenericRecord record = new GenericData.Record(schema);
        record.put("accountId", rootNode.has("accountId") ? rootNode.get("accountId").asText() : null);
        record.put("acctNumber", rootNode.has("acctNumber") ? rootNode.get("acctNumber").asText() : null);
        record.put("acquirerBIN", rootNode.has("acquirerBIN") ? rootNode.get("acquirerBIN").asText() : null);
        record.put("acquirerCountryCode", rootNode.has("acquirerCountryCode") ? rootNode.get("acquirerCountryCode").asText() : null);
        record.put("acquirerMerchantID", rootNode.has("acquirerMerchantID") ? rootNode.get("acquirerMerchantID").asText() : null);
        record.put("acsTransID", rootNode.has("acsTransID") ? rootNode.get("acsTransID").asText() : null);
        record.put("acsTxnId", rootNode.has("acsTxnId") ? rootNode.get("acsTxnId").asText() : null);
        record.put("action", rootNode.has("action") ? rootNode.get("action").asText() : null);
        record.put("addrMatch", rootNode.has("addrMatch") ? rootNode.get("addrMatch").asText() : null);
        record.put("async", rootNode.has("async") ? rootNode.get("async").asText() : null);
        record.put("authenticationType", rootNode.has("authenticationType") ? rootNode.get("authenticationType").asText() : null);
        record.put("browser_browserName", rootNode.has("browser_browserName") ? rootNode.get("browser_browserName").asText() : null);
        record.put("browser_browserNameVersion", rootNode.has("browser_browserNameVersion") ? rootNode.get("browser_browserNameVersion").asText() : null);
        record.put("browser_deviceType", rootNode.has("browser_deviceType") ? rootNode.get("browser_deviceType").asText() : null);
        record.put("browser_language", rootNode.has("browser_language") ? rootNode.get("browser_language").asText() : null);
        record.put("browser_operatingSystem", rootNode.has("browser_operatingSystem") ? rootNode.get("browser_operatingSystem").asText() : null);
        record.put("browser_osName", rootNode.has("browser_osName") ? rootNode.get("browser_osName").asText() : null);
        record.put("browserUserAgent", rootNode.has("browserUserAgent") ? rootNode.get("browserUserAgent").asText() : null);
        record.put("cardDeliveryDate", rootNode.has("cardDeliveryDate") ? rootNode.get("cardDeliveryDate").asText() : null);
        record.put("cardExpiryDate", rootNode.has("cardExpiryDate") ? rootNode.get("cardExpiryDate").asText() : null);
        record.put("cardholderName", rootNode.has("cardholderName") ? rootNode.get("cardholderName").asText() : null);
        record.put("cardNo", rootNode.has("cardNo") ? rootNode.get("cardNo").asText() : null);
        record.put("cardType", rootNode.has("cardType") ? rootNode.get("cardType").asText() : null);
        record.put("cardUnionType", rootNode.has("cardUnionType") ? rootNode.get("cardUnionType").asText() : null);
        record.put("caseAction", rootNode.has("caseAction") ? rootNode.get("caseAction").asText() : null);
        record.put("caseAssignedUser", rootNode.has("caseAssignedUser") ? rootNode.get("caseAssignedUser").asText() : null);
        record.put("caseStatus", rootNode.has("caseStatus") ? rootNode.get("caseStatus").asText() : null);
        record.put("cdnDeviceId", rootNode.has("cdnDeviceId") ? rootNode.get("cdnDeviceId").asText() : null);
        record.put("challengeType", rootNode.has("challengeType") ? rootNode.get("challengeType").asText() : null);
        record.put("channelId", rootNode.has("channelId") ? rootNode.get("channelId").asText() : null);
        record.put("city", rootNode.has("city") ? rootNode.get("city").asText() : null);
        record.put("clientId", rootNode.has("clientId") ? rootNode.get("clientId").asText() : null);
        record.put("consentId", rootNode.has("consentId") ? rootNode.get("consentId").asText() : null);
        record.put("created", rootNode.has("created") ? rootNode.get("created").asText() : null);
        record.put("currencyRateApplied", rootNode.has("currencyRateApplied") ? rootNode.get("currencyRateApplied").asText() : null);
        record.put("custBankAcctNumber", rootNode.has("custBankAcctNumber") ? rootNode.get("custBankAcctNumber").asText() : null);
        record.put("details", rootNode.has("details") ? rootNode.get("details").asText() : null);
        record.put("deviceChannel", rootNode.has("deviceChannel") ? rootNode.get("deviceChannel").asText() : null);
        record.put("deviceId", rootNode.has("deviceId") ? rootNode.get("deviceId").asText() : null);
        record.put("deviceInfo", rootNode.has("deviceInfo") ? rootNode.get("deviceInfo").asText() : null);
        record.put("deviceRenderOptions", rootNode.has("deviceRenderOptions") ? rootNode.get("deviceRenderOptions").asText() : null);
        record.put("digiCardInd", rootNode.has("digiCardInd") ? rootNode.get("digiCardInd").asText() : null);
        record.put("dsReferenceNumber", rootNode.has("dsReferenceNumber") ? rootNode.get("dsReferenceNumber").asText() : null);
        record.put("dsTransID", rootNode.has("dsTransID") ? rootNode.get("dsTransID").asText() : null);
        record.put("dsURL", rootNode.has("dsURL") ? rootNode.get("dsURL").asText() : null);
        record.put("ebean", rootNode.has("ebean") ? rootNode.get("ebean").asText() : null);
        record.put("emailId", rootNode.has("emailId") ? rootNode.get("emailId").asText() : null);
        record.put("final_transaction_status", rootNode.has("final_transaction_status") ? rootNode.get("final_transaction_status").asText() : null);
        record.put("finalStatus", rootNode.has("finalStatus") ? rootNode.get("finalStatus").asText() : null);
        record.put("instanceId", rootNode.has("instanceId") ? rootNode.get("instanceId").asText() : null);
        record.put("ip", rootNode.has("ip") ? rootNode.get("ip").asText() : null);
        record.put("ip_areacode", rootNode.has("ip_areacode") ? rootNode.get("ip_areacode").asText() : null);
        record.put("ip_city", rootNode.has("ip_city") ? rootNode.get("ip_city").asText() : null);
        record.put("ip_country_long", rootNode.has("ip_country_long") ? rootNode.get("ip_country_long").asText() : null);
        record.put("ip_domain", rootNode.has("ip_domain") ? rootNode.get("ip_domain").asText() : null);
        record.put("ip_elevation", rootNode.has("ip_elevation") ? rootNode.get("ip_elevation").asText() : null);
        record.put("ip_iddcode", rootNode.has("ip_iddcode") ? rootNode.get("ip_iddcode").asText() : null);
        record.put("ip_isp", rootNode.has("ip_isp") ? rootNode.get("ip_isp").asText() : null);
        record.put("ip_latitude", rootNode.has("ip_latitude") ? rootNode.get("ip_latitude").asText() : null);
        record.put("ip_longitude", rootNode.has("ip_longitude") ? rootNode.get("ip_longitude").asText() : null);
        record.put("ip_mcc", rootNode.has("ip_mcc") ? rootNode.get("ip_mcc").asText() : null);
        record.put("ip_mnc", rootNode.has("ip_mnc") ? rootNode.get("ip_mnc").asText() : null);
        record.put("ip_mobilebrand", rootNode.has("ip_mobilebrand") ? rootNode.get("ip_mobilebrand").asText() : null);
        record.put("ip_netspeed", rootNode.has("ip_netspeed") ? rootNode.get("ip_netspeed").asText() : null);
        record.put("ip_region", rootNode.has("ip_region") ? rootNode.get("ip_region").asText() : null);
        record.put("ip_status", rootNode.has("ip_status") ? rootNode.get("ip_status").asText() : null);
        record.put("ip_timezone", rootNode.has("ip_timezone") ? rootNode.get("ip_timezone").asText() : null);
        record.put("ip_usagetype", rootNode.has("ip_usagetype") ? rootNode.get("ip_usagetype").asText() : null);
        record.put("ip_weatherstationcode", rootNode.has("ip_weatherstationcode") ? rootNode.get("ip_weatherstationcode").asText() : null);
        record.put("ip_weatherstationname", rootNode.has("ip_weatherstationname") ? rootNode.get("ip_weatherstationname").asText() : null);
        record.put("ip_zipcode", rootNode.has("ip_zipcode") ? rootNode.get("ip_zipcode").asText() : null);
        record.put("isCase", rootNode.has("isCase") ? rootNode.get("isCase").asText() : null);
        record.put("isFirstRequest", rootNode.has("isFirstRequest") ? rootNode.get("isFirstRequest").asText() : null);
        record.put("issuerBinLength", rootNode.has("issuerBinLength") ? rootNode.get("issuerBinLength").asText() : null);
        record.put("issuerCountryCode", rootNode.has("issuerCountryCode") ? rootNode.get("issuerCountryCode").asText() : null);
        record.put("lastDrop", rootNode.has("lastDrop") ? rootNode.get("lastDrop").asText() : null);
        record.put("mcc", rootNode.has("mcc") ? rootNode.get("mcc").asText() : null);
        record.put("merchantCity", rootNode.has("merchantCity") ? rootNode.get("merchantCity").asText() : null);
        record.put("merchantCountry", rootNode.has("merchantCountry") ? rootNode.get("merchantCountry").asText() : null);
        record.put("merchantCountryCode", rootNode.has("merchantCountryCode") ? rootNode.get("merchantCountryCode").asText() : null);
        record.put("merchantFraudRate", rootNode.has("merchantFraudRate") ? rootNode.get("merchantFraudRate").asText() : null);
        record.put("merchantId", rootNode.has("merchantId") ? rootNode.get("merchantId").asText() : null);
        record.put("merchantName", rootNode.has("merchantName") ? rootNode.get("merchantName").asText() : null);
        record.put("merchantPageTxn", rootNode.has("merchantPageTxn") ? rootNode.get("merchantPageTxn").asText() : null);
        record.put("messageCategory", rootNode.has("messageCategory") ? rootNode.get("messageCategory").asText() : null);
        record.put("messageExtension", rootNode.has("messageExtension") ? rootNode.get("messageExtension").asText() : null);
        record.put("messageType", rootNode.has("messageType") ? rootNode.get("messageType").asText() : null);
        record.put("messageVersion", rootNode.has("messageVersion") ? rootNode.get("messageVersion").asText() : null);
        record.put("mobileNo", rootNode.has("mobileNo") ? rootNode.get("mobileNo").asText() : null);
        record.put("partRequest", rootNode.has("partRequest") ? rootNode.get("partRequest").asText() : null);
        record.put("payTokenInd", rootNode.has("payTokenInd") ? rootNode.get("payTokenInd").asText() : null);
        record.put("pinCode", rootNode.has("pinCode") ? rootNode.get("pinCode").asText() : null);
        record.put("policyEngineReq", rootNode.has("policyEngineReq") ? rootNode.get("policyEngineReq").asText() : null);
        record.put("profileFlags", rootNode.has("profileFlags") ? rootNode.get("profileFlags").asText() : null);
        record.put("purchaseAmount", rootNode.has("purchaseAmount") ? rootNode.get("purchaseAmount").asText() : null);
        record.put("purchaseCurrency", rootNode.has("purchaseCurrency") ? rootNode.get("purchaseCurrency").asText() : null);
        record.put("purchaseCurrencyCode", rootNode.has("purchaseCurrencyCode") ? rootNode.get("purchaseCurrencyCode").asText() : null);
        record.put("purchaseDate", rootNode.has("purchaseDate") ? rootNode.get("purchaseDate").asText() : null);
        record.put("purchaseExponent", rootNode.has("purchaseExponent") ? rootNode.get("purchaseExponent").asText() : null);
        record.put("rating", rootNode.has("rating") ? rootNode.get("rating").asText() : null);
        record.put("reason", rootNode.has("reason") ? rootNode.get("reason").asText() : null);
        record.put("remarks", rootNode.has("remarks") ? rootNode.get("remarks").asText() : null);
        record.put("rrn", rootNode.has("rrn") ? rootNode.get("rrn").asText() : null);
        record.put("sdkAppID", rootNode.has("sdkAppID") ? rootNode.get("sdkAppID").asText() : null);
        record.put("sdkEphemPubKey", rootNode.has("sdkEphemPubKey") ? rootNode.get("sdkEphemPubKey").asText() : null);
        record.put("sdkMaxTimeout", rootNode.has("sdkMaxTimeout") ? rootNode.get("sdkMaxTimeout").asText() : null);
        record.put("sdkReferenceNumber", rootNode.has("sdkReferenceNumber") ? rootNode.get("sdkReferenceNumber").asText() : null);
        record.put("sdkTransID", rootNode.has("sdkTransID") ? rootNode.get("sdkTransID").asText() : null);
        record.put("sourceAmount", rootNode.has("sourceAmount") ? rootNode.get("sourceAmount").asText() : null);
        record.put("sourceCurrencyCode", rootNode.has("sourceCurrencyCode") ? rootNode.get("sourceCurrencyCode").asText() : null);
        record.put("state", rootNode.has("state") ? rootNode.get("state").asText() : null);
        record.put("suggestion", rootNode.has("suggestion") ? rootNode.get("suggestion").asText() : null);
        record.put("threeDsMcc", rootNode.has("threeDsMcc") ? rootNode.get("threeDsMcc").asText() : null);
        record.put("threeDSRequestorAuthenticationInd", rootNode.has("threeDSRequestorAuthenticationInd") ? rootNode.get("threeDSRequestorAuthenticationInd").asText() : null);
        record.put("threeDSRequestorChallengeInd", rootNode.has("threeDSRequestorChallengeInd") ? rootNode.get("threeDSRequestorChallengeInd").asText() : null);
        record.put("threeDSRequestorID", rootNode.has("threeDSRequestorID") ? rootNode.get("threeDSRequestorID").asText() : null);
        record.put("threeDSRequestorName", rootNode.has("threeDSRequestorName") ? rootNode.get("threeDSRequestorName").asText() : null);
        record.put("threeDSRequestorURL", rootNode.has("threeDSRequestorURL") ? rootNode.get("threeDSRequestorURL").asText() : null);
        record.put("threeDSServerOperatorID", rootNode.has("threeDSServerOperatorID") ? rootNode.get("threeDSServerOperatorID").asText() : null);
        record.put("threeDSServerRefNumber", rootNode.has("threeDSServerRefNumber") ? rootNode.get("threeDSServerRefNumber").asText() : null);
        record.put("threeDSServerTransID", rootNode.has("threeDSServerTransID") ? rootNode.get("threeDSServerTransID").asText() : null);
        record.put("threeDSServerURL", rootNode.has("threeDSServerURL") ? rootNode.get("threeDSServerURL").asText() : null);
        record.put("timeStamp", rootNode.has("timeStamp") ? rootNode.get("timeStamp").asText() : null);
        record.put("transType", rootNode.has("transType") ? rootNode.get("transType").asText() : null);
        record.put("txnSourceType", rootNode.has("txnSourceType") ? rootNode.get("txnSourceType").asText() : null);
        record.put("txnType", rootNode.has("txnType") ? rootNode.get("txnType").asText() : null);
        writer.write(record);
        writer.close();
        System.out.println("Parquet file created at: " + outputFile.getAbsolutePath());
    }
}