package model;

public class Sport {
private String name;
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
	this.name = sport;
	this.description = description;
}
/**
 * @return the sport
 */
public String getName() {
	return name;
}
/**
 * @param sport the sport to set
 */
public void setName(String name) {
	this.name = name;
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
