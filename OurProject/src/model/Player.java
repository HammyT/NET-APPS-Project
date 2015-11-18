package model;

public class Player {
private int id;
private String fName;
private String lName;
private String position;
private int number;
private String email;
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
 * @param position
 * @param number
 * @param email
 * @param age
 */
public Player(int id, String fName, String lName, String position, int number, String email, int age) {
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.position = position;
	this.number = number;
	this.email = email;
	this.age = age;
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
 * @return the position
 */
public String getPosition() {
	return position;
}
/**
 * @param position the position to set
 */
public void setPosition(String position) {
	this.position = position;
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
