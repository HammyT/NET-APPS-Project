package model;

public class Player {
private String id;
private String fName;
private String lName;
private String gender;
private int age;
/**
 * 
 */
public Player() {
}
/**
 * @param id
 * @param fName
 * @param lName
 * @param gender
 * @param age
 */
public Player(String id, String fName, String lName, String gender, int age) {
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.gender = gender;
	this.age = age;
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
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

}
