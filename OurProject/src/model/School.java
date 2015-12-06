package model;

public class School {
private String id;
private String name;
private int number;
private String address;
private String state;
private String zip;
private String region;
private String admissionUrl;
private String financialUrl;
private String applicationUrl;
private String priceUrl;
private String email;
private String country;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the number
 */
public int getNumber() {
	return number;
}
/**
 * @param number the number to set
 */
public void setNumber(int number) {
	this.number = number;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}
/**
 * @return the region
 */
public String getRegion() {
	return region;
}
/**
 * @param region the region to set
 */
public void setRegion(String region) {
	this.region = region;
}
/**
 * @return the admissionUrl
 */
public String getAdmissionUrl() {
	return admissionUrl;
}
/**
 * @param admissionUrl the admissionUrl to set
 */
public void setAdmissionUrl(String admissionUrl) {
	this.admissionUrl = admissionUrl;
}
/**
 * @return the financialUrl
 */
public String getFinancialUrl() {
	return financialUrl;
}
/**
 * @param financialUrl the financialUrl to set
 */
public void setFinancialUrl(String financialUrl) {
	this.financialUrl = financialUrl;
}
/**
 * @return the priceUrl
 */
public String getPriceUrl() {
	return priceUrl;
}
/**
 * @param priceUrl the priceUrl to set
 */
public void setPriceUrl(String priceUrl) {
	this.priceUrl = priceUrl;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}

/**
 * 
 */
public School() {
}
/**
 * @return the applicationUrl
 */
public String getApplicationUrl() {
	return applicationUrl;
}
/**
 * @param applicationUrl the applicationUrl to set
 */
public void setApplicationUrl(String applicationUrl) {
	this.applicationUrl = applicationUrl;
}
/**
 * @param id
 * @param name
 * @param number
 * @param address
 * @param state
 * @param zip
 * @param region
 * @param admissionUrl
 * @param financialUrl
 * @param applicationUrl
 * @param priceUrl
 * @param email
 * @param country
 */
public School(String id, String name, int number, String address, String state, String zip, String region,
		String admissionUrl, String financialUrl, String applicationUrl, String priceUrl, String email,
		String country) {
	this.id = id;
	this.name = name;
	this.number = number;
	this.address = address;
	this.state = state;
	this.zip = zip;
	this.region = region;
	this.admissionUrl = admissionUrl;
	this.financialUrl = financialUrl;
	this.applicationUrl = applicationUrl;
	this.priceUrl = priceUrl;
	this.email = email;
	this.country = country;
}

}
