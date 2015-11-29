package model;

public class Organization {
private String name;
private int number;
private String address;
private String city;
private String state;
private String region;
private int zip;
/**
 * 
 */
public Organization() {
}
/**
 * @param name
 * @param address
 * @param city
 * @param state
 * @param region
 * @param zip
 * @param country
 */
public Organization(String name, String address, String city, String state, String region, int zip) {
	this.name = name;
	this.address = address;
	this.city = city;
	this.state = state;
	this.region = region;
	this.zip = zip;
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
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
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
 * @return the zip
 */
public int getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(int zip) {
	this.zip = zip;
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

}
