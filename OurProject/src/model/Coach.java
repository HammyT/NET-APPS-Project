package model;

public class Coach {
private String id;
private String fName;
private String lName;
/**
 * 
 */
public Coach() {
}
/**
 * @param id
 * @param fName
 * @param lName
 */
public Coach(String id, String fName, String lName) {
	this.id = id;
	this.fName = fName;
	this.lName = lName;

}
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
 * @return the fName
 */
public String getfName() {
	return fName;
}
/**
 * @param fName the fName to set
 */
public void setfName(String fName) {
	this.fName = fName;
}
/**
 * @return the lName
 */
public String getlName() {
	return lName;
}
/**
 * @param lName the lName to set
 */
public void setlName(String lName) {
	this.lName = lName;
}

}
