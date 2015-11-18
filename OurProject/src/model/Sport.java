package model;

public class Sport {
private String sport;
private String description;
/**
 * 
 */
public Sport() {
}
/**
 * @param sport
 * @param description
 */
public Sport(String sport, String description) {
	this.sport = sport;
	this.description = description;
}
/**
 * @return the sport
 */
public String getSport() {
	return sport;
}
/**
 * @param sport the sport to set
 */
public void setSport(String sport) {
	this.sport = sport;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}


}
