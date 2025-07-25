package com.tripathi.ojas.parquet_converter;

public class RecordEntry {
	private String accountId;
	private String acctNumber;
	private String acquirerBIN;
	private String acquirerCountryCode;
	private String acquirerMerchantID;
	private String acsTransID;
	private String acsTxnId;
	private String action;
	private String addrMatch;
	private String async;
	private String authenticationType;
	private String browser_browserName;
	private String browser_browserNameVersion;
	private String browser_deviceType;
	private String browser_language;
	private String browser_operatingSystem;
	private String browser_osName;
	private String browserUserAgent;
	private String cardDeliveryDate;
	private String cardExpiryDate;
	private String cardholderName;
	private String cardNo;
	private String cardType;
	private String cardUnionType;
	private String caseAction;
	private String caseAssignedUser;
	private String caseStatus;
	private String cdnDeviceId;
	private String challengeType;
	private String channelId;
	private String city;
	private String clientId;
	private String consentId;
	private String created;
	private String currencyRateApplied;
	private String custBankAcctNumber;
	private String details;
	private String deviceChannel;
	private String deviceId;
	private String deviceInfo;
	private String deviceRenderOptions;
	private String digiCardInd;
	private String dsReferenceNumber;
	private String dsTransID;
	private String dsURL;
	private String ebean;
	private String emailId;
	private String final_transaction_status;
	private String finalStatus;
	private String instanceId;
	private String ip;
	private String ip_areacode;
	private String ip_city;
	private String ip_country_long;
	private String ip_domain;
	private String ip_elevation;
	private String ip_iddcode;
	private String ip_isp;
	private String ip_latitude;
	private String ip_longitude;
	private String ip_mcc;
	private String ip_mnc;
	private String ip_mobilebrand;
	private String ip_netspeed;
	private String ip_region;
	private String ip_status;
	private String ip_timezone;
	private String ip_usagetype;
	private String ip_weatherstationcode;
	private String ip_weatherstationname;
	private String ip_zipcode;
	private String isCase;
	private String isFirstRequest;
	private String issuerBinLength;
	private String issuerCountryCode;
	private String lastDrop;
	private String mcc;
	private String merchantCity;
	private String merchantCountry;
	private String merchantCountryCode;
	private String merchantFraudRate;
	private String merchantId;
	private String merchantName;
	private String merchantPageTxn;
	private String messageCategory;
	private String messageExtension;
	private String messageType;
	private String messageVersion;
	private String mobileNo;
	private String partRequest;
	private String payTokenInd;
	private String pinCode;
	private String policyEngineReq;
	private String profileFlags;
	private String purchaseAmount;
	private String purchaseCurrency;
	private String purchaseCurrencyCode;
	private String purchaseDate;
	private String purchaseExponent;
	private String rating;
	private String reason;
	private String remarks;
	private String rrn;
	private String sdkAppID;
	private String sdkEphemPubKey;
	private String sdkMaxTimeout;
	private String sdkReferenceNumber;
	private String sdkTransID;
	private String sourceAmount;
	private String sourceCurrencyCode;
	private String state;
	private String suggestion;
	private String threeDsMcc;
	private String threeDSRequestorAuthenticationInd;
	private String threeDSRequestorChallengeInd;
	private String threeDSRequestorID;
	private String threeDSRequestorName;
	private String threeDSRequestorURL;
	private String threeDSServerOperatorID;
	private String threeDSServerRefNumber;
	private String threeDSServerTransID;
	private String threeDSServerURL;
	private String timeStamp;
	private String transType;
	private String txnSourceType;
	private String txnType;
	public RecordEntry() {}
	public RecordEntry(String accountId, String acctNumber, String acquirerBIN, String acquirerCountryCode, String acquirerMerchantID, String acsTransID, String acsTxnId, String action, String addrMatch, String async, String authenticationType, String browser_browserName, String browser_browserNameVersion, String browser_deviceType, String browser_language, String browser_operatingSystem, String browser_osName, String browserUserAgent, String cardDeliveryDate, String cardExpiryDate, String cardholderName, String cardNo, String cardType, String cardUnionType, String caseAction, String caseAssignedUser, String caseStatus, String cdnDeviceId, String challengeType, String channelId, String city, String clientId, String consentId, String created, String currencyRateApplied, String custBankAcctNumber, String details, String deviceChannel, String deviceId, String deviceInfo, String deviceRenderOptions, String digiCardInd, String dsReferenceNumber, String dsTransID, String dsURL, String ebean, String emailId, String final_transaction_status, String finalStatus, String instanceId, String ip, String ip_areacode, String ip_city, String ip_country_long, String ip_domain, String ip_elevation, String ip_iddcode, String ip_isp, String ip_latitude, String ip_longitude, String ip_mcc, String ip_mnc, String ip_mobilebrand, String ip_netspeed, String ip_region, String ip_status, String ip_timezone, String ip_usagetype, String ip_weatherstationcode, String ip_weatherstationname, String ip_zipcode, String isCase, String isFirstRequest, String issuerBinLength, String issuerCountryCode, String lastDrop, String mcc, String merchantCity, String merchantCountry, String merchantCountryCode, String merchantFraudRate, String merchantId, String merchantName, String merchantPageTxn, String messageCategory, String messageExtension, String messageType, String messageVersion, String mobileNo, String partRequest, String payTokenInd, String pinCode, String policyEngineReq, String profileFlags, String purchaseAmount, String purchaseCurrency, String purchaseCurrencyCode, String purchaseDate, String purchaseExponent, String rating, String reason, String remarks, String rrn, String sdkAppID, String sdkEphemPubKey, String sdkMaxTimeout, String sdkReferenceNumber, String sdkTransID, String sourceAmount, String sourceCurrencyCode, String state, String suggestion, String threeDsMcc, String threeDSRequestorAuthenticationInd, String threeDSRequestorChallengeInd, String threeDSRequestorID, String threeDSRequestorName, String threeDSRequestorURL, String threeDSServerOperatorID, String threeDSServerRefNumber, String threeDSServerTransID, String threeDSServerURL, String timeStamp, String transType, String txnSourceType, String txnType) {
		this.accountId = accountId;
		this.acctNumber = acctNumber;
		this.acquirerBIN = acquirerBIN;
		this.acquirerCountryCode = acquirerCountryCode;
		this.acquirerMerchantID = acquirerMerchantID;
		this.acsTransID = acsTransID;
		this.acsTxnId = acsTxnId;
		this.action = action;
		this.addrMatch = addrMatch;
		this.async = async;
		this.authenticationType = authenticationType;
		this.browser_browserName = browser_browserName;
		this.browser_browserNameVersion = browser_browserNameVersion;
		this.browser_deviceType = browser_deviceType;
		this.browser_language = browser_language;
		this.browser_operatingSystem = browser_operatingSystem;
		this.browser_osName = browser_osName;
		this.browserUserAgent = browserUserAgent;
		this.cardDeliveryDate = cardDeliveryDate;
		this.cardExpiryDate = cardExpiryDate;
		this.cardholderName = cardholderName;
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.cardUnionType = cardUnionType;
		this.caseAction = caseAction;
		this.caseAssignedUser = caseAssignedUser;
		this.caseStatus = caseStatus;
		this.cdnDeviceId = cdnDeviceId;
		this.challengeType = challengeType;
		this.channelId = channelId;
		this.city = city;
		this.clientId = clientId;
		this.consentId = consentId;
		this.created = created;
		this.currencyRateApplied = currencyRateApplied;
		this.custBankAcctNumber = custBankAcctNumber;
		this.details = details;
		this.deviceChannel = deviceChannel;
		this.deviceId = deviceId;
		this.deviceInfo = deviceInfo;
		this.deviceRenderOptions = deviceRenderOptions;
		this.digiCardInd = digiCardInd;
		this.dsReferenceNumber = dsReferenceNumber;
		this.dsTransID = dsTransID;
		this.dsURL = dsURL;
		this.ebean = ebean;
		this.emailId = emailId;
		this.final_transaction_status = final_transaction_status;
		this.finalStatus = finalStatus;
		this.instanceId = instanceId;
		this.ip = ip;
		this.ip_areacode = ip_areacode;
		this.ip_city = ip_city;
		this.ip_country_long = ip_country_long;
		this.ip_domain = ip_domain;
		this.ip_elevation = ip_elevation;
		this.ip_iddcode = ip_iddcode;
		this.ip_isp = ip_isp;
		this.ip_latitude = ip_latitude;
		this.ip_longitude = ip_longitude;
		this.ip_mcc = ip_mcc;
		this.ip_mnc = ip_mnc;
		this.ip_mobilebrand = ip_mobilebrand;
		this.ip_netspeed = ip_netspeed;
		this.ip_region = ip_region;
		this.ip_status = ip_status;
		this.ip_timezone = ip_timezone;
		this.ip_usagetype = ip_usagetype;
		this.ip_weatherstationcode = ip_weatherstationcode;
		this.ip_weatherstationname = ip_weatherstationname;
		this.ip_zipcode = ip_zipcode;
		this.isCase = isCase;
		this.isFirstRequest = isFirstRequest;
		this.issuerBinLength = issuerBinLength;
		this.issuerCountryCode = issuerCountryCode;
		this.lastDrop = lastDrop;
		this.mcc = mcc;
		this.merchantCity = merchantCity;
		this.merchantCountry = merchantCountry;
		this.merchantCountryCode = merchantCountryCode;
		this.merchantFraudRate = merchantFraudRate;
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.merchantPageTxn = merchantPageTxn;
		this.messageCategory = messageCategory;
		this.messageExtension = messageExtension;
		this.messageType = messageType;
		this.messageVersion = messageVersion;
		this.mobileNo = mobileNo;
		this.partRequest = partRequest;
		this.payTokenInd = payTokenInd;
		this.pinCode = pinCode;
		this.policyEngineReq = policyEngineReq;
		this.profileFlags = profileFlags;
		this.purchaseAmount = purchaseAmount;
		this.purchaseCurrency = purchaseCurrency;
		this.purchaseCurrencyCode = purchaseCurrencyCode;
		this.purchaseDate = purchaseDate;
		this.purchaseExponent = purchaseExponent;
		this.rating = rating;
		this.reason = reason;
		this.remarks = remarks;
		this.rrn = rrn;
		this.sdkAppID = sdkAppID;
		this.sdkEphemPubKey = sdkEphemPubKey;
		this.sdkMaxTimeout = sdkMaxTimeout;
		this.sdkReferenceNumber = sdkReferenceNumber;
		this.sdkTransID = sdkTransID;
		this.sourceAmount = sourceAmount;
		this.sourceCurrencyCode = sourceCurrencyCode;
		this.state = state;
		this.suggestion = suggestion;
		this.threeDsMcc = threeDsMcc;
		this.threeDSRequestorAuthenticationInd = threeDSRequestorAuthenticationInd;
		this.threeDSRequestorChallengeInd = threeDSRequestorChallengeInd;
		this.threeDSRequestorID = threeDSRequestorID;
		this.threeDSRequestorName = threeDSRequestorName;
		this.threeDSRequestorURL = threeDSRequestorURL;
		this.threeDSServerOperatorID = threeDSServerOperatorID;
		this.threeDSServerRefNumber = threeDSServerRefNumber;
		this.threeDSServerTransID = threeDSServerTransID;
		this.threeDSServerURL = threeDSServerURL;
		this.timeStamp = timeStamp;
		this.transType = transType;
		this.txnSourceType = txnSourceType;
		this.txnType = txnType;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getAcquirerBIN() {
		return acquirerBIN;
	}
	public void setAcquirerBIN(String acquirerBIN) {
		this.acquirerBIN = acquirerBIN;
	}
	public String getAcquirerCountryCode() {
		return acquirerCountryCode;
	}
	public void setAcquirerCountryCode(String acquirerCountryCode) {
		this.acquirerCountryCode = acquirerCountryCode;
	}
	public String getAcquirerMerchantID() {
		return acquirerMerchantID;
	}
	public void setAcquirerMerchantID(String acquirerMerchantID) {
		this.acquirerMerchantID = acquirerMerchantID;
	}
	public String getAcsTransID() {
		return acsTransID;
	}
	public void setAcsTransID(String acsTransID) {
		this.acsTransID = acsTransID;
	}
	public String getAcsTxnId() {
		return acsTxnId;
	}
	public void setAcsTxnId(String acsTxnId) {
		this.acsTxnId = acsTxnId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAddrMatch() {
		return addrMatch;
	}
	public void setAddrMatch(String addrMatch) {
		this.addrMatch = addrMatch;
	}
	public String getAsync() {
		return async;
	}
	public void setAsync(String async) {
		this.async = async;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getBrowser_browserName() {
		return browser_browserName;
	}
	public void setBrowser_browserName(String browser_browserName) {
		this.browser_browserName = browser_browserName;
	}
	public String getBrowser_browserNameVersion() {
		return browser_browserNameVersion;
	}
	public void setBrowser_browserNameVersion(String browser_browserNameVersion) {
		this.browser_browserNameVersion = browser_browserNameVersion;
	}
	public String getBrowser_deviceType() {
		return browser_deviceType;
	}
	public void setBrowser_deviceType(String browser_deviceType) {
		this.browser_deviceType = browser_deviceType;
	}
	public String getBrowser_language() {
		return browser_language;
	}
	public void setBrowser_language(String browser_language) {
		this.browser_language = browser_language;
	}
	public String getBrowser_operatingSystem() {
		return browser_operatingSystem;
	}
	public void setBrowser_operatingSystem(String browser_operatingSystem) {
		this.browser_operatingSystem = browser_operatingSystem;
	}
	public String getBrowser_osName() {
		return browser_osName;
	}
	public void setBrowser_osName(String browser_osName) {
		this.browser_osName = browser_osName;
	}
	public String getBrowserUserAgent() {
		return browserUserAgent;
	}
	public void setBrowserUserAgent(String browserUserAgent) {
		this.browserUserAgent = browserUserAgent;
	}
	public String getCardDeliveryDate() {
		return cardDeliveryDate;
	}
	public void setCardDeliveryDate(String cardDeliveryDate) {
		this.cardDeliveryDate = cardDeliveryDate;
	}
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}
	public String getCardholderName() {
		return cardholderName;
	}
	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardUnionType() {
		return cardUnionType;
	}
	public void setCardUnionType(String cardUnionType) {
		this.cardUnionType = cardUnionType;
	}
	public String getCaseAction() {
		return caseAction;
	}
	public void setCaseAction(String caseAction) {
		this.caseAction = caseAction;
	}
	public String getCaseAssignedUser() {
		return caseAssignedUser;
	}
	public void setCaseAssignedUser(String caseAssignedUser) {
		this.caseAssignedUser = caseAssignedUser;
	}
	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public String getCdnDeviceId() {
		return cdnDeviceId;
	}
	public void setCdnDeviceId(String cdnDeviceId) {
		this.cdnDeviceId = cdnDeviceId;
	}
	public String getChallengeType() {
		return challengeType;
	}
	public void setChallengeType(String challengeType) {
		this.challengeType = challengeType;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getConsentId() {
		return consentId;
	}
	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getCurrencyRateApplied() {
		return currencyRateApplied;
	}
	public void setCurrencyRateApplied(String currencyRateApplied) {
		this.currencyRateApplied = currencyRateApplied;
	}
	public String getCustBankAcctNumber() {
		return custBankAcctNumber;
	}
	public void setCustBankAcctNumber(String custBankAcctNumber) {
		this.custBankAcctNumber = custBankAcctNumber;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getDeviceChannel() {
		return deviceChannel;
	}
	public void setDeviceChannel(String deviceChannel) {
		this.deviceChannel = deviceChannel;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getDeviceRenderOptions() {
		return deviceRenderOptions;
	}
	public void setDeviceRenderOptions(String deviceRenderOptions) {
		this.deviceRenderOptions = deviceRenderOptions;
	}
	public String getDigiCardInd() {
		return digiCardInd;
	}
	public void setDigiCardInd(String digiCardInd) {
		this.digiCardInd = digiCardInd;
	}
	public String getDsReferenceNumber() {
		return dsReferenceNumber;
	}
	public void setDsReferenceNumber(String dsReferenceNumber) {
		this.dsReferenceNumber = dsReferenceNumber;
	}
	public String getDsTransID() {
		return dsTransID;
	}
	public void setDsTransID(String dsTransID) {
		this.dsTransID = dsTransID;
	}
	public String getDsURL() {
		return dsURL;
	}
	public void setDsURL(String dsURL) {
		this.dsURL = dsURL;
	}
	public String getEbean() {
		return ebean;
	}
	public void setEbean(String ebean) {
		this.ebean = ebean;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFinal_transaction_status() {
		return final_transaction_status;
	}
	public void setFinal_transaction_status(String final_transaction_status) {
		this.final_transaction_status = final_transaction_status;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp_areacode() {
		return ip_areacode;
	}
	public void setIp_areacode(String ip_areacode) {
		this.ip_areacode = ip_areacode;
	}
	public String getIp_city() {
		return ip_city;
	}
	public void setIp_city(String ip_city) {
		this.ip_city = ip_city;
	}
	public String getIp_country_long() {
		return ip_country_long;
	}
	public void setIp_country_long(String ip_country_long) {
		this.ip_country_long = ip_country_long;
	}
	public String getIp_domain() {
		return ip_domain;
	}
	public void setIp_domain(String ip_domain) {
		this.ip_domain = ip_domain;
	}
	public String getIp_elevation() {
		return ip_elevation;
	}
	public void setIp_elevation(String ip_elevation) {
		this.ip_elevation = ip_elevation;
	}
	public String getIp_iddcode() {
		return ip_iddcode;
	}
	public void setIp_iddcode(String ip_iddcode) {
		this.ip_iddcode = ip_iddcode;
	}
	public String getIp_isp() {
		return ip_isp;
	}
	public void setIp_isp(String ip_isp) {
		this.ip_isp = ip_isp;
	}
	public String getIp_latitude() {
		return ip_latitude;
	}
	public void setIp_latitude(String ip_latitude) {
		this.ip_latitude = ip_latitude;
	}
	public String getIp_longitude() {
		return ip_longitude;
	}
	public void setIp_longitude(String ip_longitude) {
		this.ip_longitude = ip_longitude;
	}
	public String getIp_mcc() {
		return ip_mcc;
	}
	public void setIp_mcc(String ip_mcc) {
		this.ip_mcc = ip_mcc;
	}
	public String getIp_mnc() {
		return ip_mnc;
	}
	public void setIp_mnc(String ip_mnc) {
		this.ip_mnc = ip_mnc;
	}
	public String getIp_mobilebrand() {
		return ip_mobilebrand;
	}
	public void setIp_mobilebrand(String ip_mobilebrand) {
		this.ip_mobilebrand = ip_mobilebrand;
	}
	public String getIp_netspeed() {
		return ip_netspeed;
	}
	public void setIp_netspeed(String ip_netspeed) {
		this.ip_netspeed = ip_netspeed;
	}
	public String getIp_region() {
		return ip_region;
	}
	public void setIp_region(String ip_region) {
		this.ip_region = ip_region;
	}
	public String getIp_status() {
		return ip_status;
	}
	public void setIp_status(String ip_status) {
		this.ip_status = ip_status;
	}
	public String getIp_timezone() {
		return ip_timezone;
	}
	public void setIp_timezone(String ip_timezone) {
		this.ip_timezone = ip_timezone;
	}
	public String getIp_usagetype() {
		return ip_usagetype;
	}
	public void setIp_usagetype(String ip_usagetype) {
		this.ip_usagetype = ip_usagetype;
	}
	public String getIp_weatherstationcode() {
		return ip_weatherstationcode;
	}
	public void setIp_weatherstationcode(String ip_weatherstationcode) {
		this.ip_weatherstationcode = ip_weatherstationcode;
	}
	public String getIp_weatherstationname() {
		return ip_weatherstationname;
	}
	public void setIp_weatherstationname(String ip_weatherstationname) {
		this.ip_weatherstationname = ip_weatherstationname;
	}
	public String getIp_zipcode() {
		return ip_zipcode;
	}
	public void setIp_zipcode(String ip_zipcode) {
		this.ip_zipcode = ip_zipcode;
	}
	public String getIsCase() {
		return isCase;
	}
	public void setIsCase(String isCase) {
		this.isCase = isCase;
	}
	public String getIsFirstRequest() {
		return isFirstRequest;
	}
	public void setIsFirstRequest(String isFirstRequest) {
		this.isFirstRequest = isFirstRequest;
	}
	public String getIssuerBinLength() {
		return issuerBinLength;
	}
	public void setIssuerBinLength(String issuerBinLength) {
		this.issuerBinLength = issuerBinLength;
	}
	public String getIssuerCountryCode() {
		return issuerCountryCode;
	}
	public void setIssuerCountryCode(String issuerCountryCode) {
		this.issuerCountryCode = issuerCountryCode;
	}
	public String getLastDrop() {
		return lastDrop;
	}
	public void setLastDrop(String lastDrop) {
		this.lastDrop = lastDrop;
	}
	public String getMcc() {
		return mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	public String getMerchantCity() {
		return merchantCity;
	}
	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}
	public String getMerchantCountry() {
		return merchantCountry;
	}
	public void setMerchantCountry(String merchantCountry) {
		this.merchantCountry = merchantCountry;
	}
	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}
	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}
	public String getMerchantFraudRate() {
		return merchantFraudRate;
	}
	public void setMerchantFraudRate(String merchantFraudRate) {
		this.merchantFraudRate = merchantFraudRate;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantPageTxn() {
		return merchantPageTxn;
	}
	public void setMerchantPageTxn(String merchantPageTxn) {
		this.merchantPageTxn = merchantPageTxn;
	}
	public String getMessageCategory() {
		return messageCategory;
	}
	public void setMessageCategory(String messageCategory) {
		this.messageCategory = messageCategory;
	}
	public String getMessageExtension() {
		return messageExtension;
	}
	public void setMessageExtension(String messageExtension) {
		this.messageExtension = messageExtension;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageVersion() {
		return messageVersion;
	}
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPartRequest() {
		return partRequest;
	}
	public void setPartRequest(String partRequest) {
		this.partRequest = partRequest;
	}
	public String getPayTokenInd() {
		return payTokenInd;
	}
	public void setPayTokenInd(String payTokenInd) {
		this.payTokenInd = payTokenInd;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getPolicyEngineReq() {
		return policyEngineReq;
	}
	public void setPolicyEngineReq(String policyEngineReq) {
		this.policyEngineReq = policyEngineReq;
	}
	public String getProfileFlags() {
		return profileFlags;
	}
	public void setProfileFlags(String profileFlags) {
		this.profileFlags = profileFlags;
	}
	public String getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public String getPurchaseCurrency() {
		return purchaseCurrency;
	}
	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
	}
	public String getPurchaseCurrencyCode() {
		return purchaseCurrencyCode;
	}
	public void setPurchaseCurrencyCode(String purchaseCurrencyCode) {
		this.purchaseCurrencyCode = purchaseCurrencyCode;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getPurchaseExponent() {
		return purchaseExponent;
	}
	public void setPurchaseExponent(String purchaseExponent) {
		this.purchaseExponent = purchaseExponent;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getSdkAppID() {
		return sdkAppID;
	}
	public void setSdkAppID(String sdkAppID) {
		this.sdkAppID = sdkAppID;
	}
	public String getSdkEphemPubKey() {
		return sdkEphemPubKey;
	}
	public void setSdkEphemPubKey(String sdkEphemPubKey) {
		this.sdkEphemPubKey = sdkEphemPubKey;
	}
	public String getSdkMaxTimeout() {
		return sdkMaxTimeout;
	}
	public void setSdkMaxTimeout(String sdkMaxTimeout) {
		this.sdkMaxTimeout = sdkMaxTimeout;
	}
	public String getSdkReferenceNumber() {
		return sdkReferenceNumber;
	}
	public void setSdkReferenceNumber(String sdkReferenceNumber) {
		this.sdkReferenceNumber = sdkReferenceNumber;
	}
	public String getSdkTransID() {
		return sdkTransID;
	}
	public void setSdkTransID(String sdkTransID) {
		this.sdkTransID = sdkTransID;
	}
	public String getSourceAmount() {
		return sourceAmount;
	}
	public void setSourceAmount(String sourceAmount) {
		this.sourceAmount = sourceAmount;
	}
	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}
	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getThreeDsMcc() {
		return threeDsMcc;
	}
	public void setThreeDsMcc(String threeDsMcc) {
		this.threeDsMcc = threeDsMcc;
	}
	public String getThreeDSRequestorAuthenticationInd() {
		return threeDSRequestorAuthenticationInd;
	}
	public void setThreeDSRequestorAuthenticationInd(String threeDSRequestorAuthenticationInd) {
		this.threeDSRequestorAuthenticationInd = threeDSRequestorAuthenticationInd;
	}
	public String getThreeDSRequestorChallengeInd() {
		return threeDSRequestorChallengeInd;
	}
	public void setThreeDSRequestorChallengeInd(String threeDSRequestorChallengeInd) {
		this.threeDSRequestorChallengeInd = threeDSRequestorChallengeInd;
	}
	public String getThreeDSRequestorID() {
		return threeDSRequestorID;
	}
	public void setThreeDSRequestorID(String threeDSRequestorID) {
		this.threeDSRequestorID = threeDSRequestorID;
	}
	public String getThreeDSRequestorName() {
		return threeDSRequestorName;
	}
	public void setThreeDSRequestorName(String threeDSRequestorName) {
		this.threeDSRequestorName = threeDSRequestorName;
	}
	public String getThreeDSRequestorURL() {
		return threeDSRequestorURL;
	}
	public void setThreeDSRequestorURL(String threeDSRequestorURL) {
		this.threeDSRequestorURL = threeDSRequestorURL;
	}
	public String getThreeDSServerOperatorID() {
		return threeDSServerOperatorID;
	}
	public void setThreeDSServerOperatorID(String threeDSServerOperatorID) {
		this.threeDSServerOperatorID = threeDSServerOperatorID;
	}
	public String getThreeDSServerRefNumber() {
		return threeDSServerRefNumber;
	}
	public void setThreeDSServerRefNumber(String threeDSServerRefNumber) {
		this.threeDSServerRefNumber = threeDSServerRefNumber;
	}
	public String getThreeDSServerTransID() {
		return threeDSServerTransID;
	}
	public void setThreeDSServerTransID(String threeDSServerTransID) {
		this.threeDSServerTransID = threeDSServerTransID;
	}
	public String getThreeDSServerURL() {
		return threeDSServerURL;
	}
	public void setThreeDSServerURL(String threeDSServerURL) {
		this.threeDSServerURL = threeDSServerURL;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTxnSourceType() {
		return txnSourceType;
	}
	public void setTxnSourceType(String txnSourceType) {
		this.txnSourceType = txnSourceType;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
}