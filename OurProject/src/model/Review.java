package model;

public class Review {
private int id;
private String date;
private String description;
/**
 * 
 */
public Review() {
}
/**
 * @param id
 * @param date
 * @param description
 */
public Review(int id, String date, String description) {
	this.id = id;
	this.date = date;
	this.description = description;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the date
 */
public String getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(String date) {
	this.date = date;
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
