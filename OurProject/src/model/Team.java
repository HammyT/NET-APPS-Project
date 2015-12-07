package model;

public class Team {
private String id;
private String name;
private String coach;
private String level;
private String division;
/**
 * 
 */
public Team() {
}
/**
 * @param id
 * @param name
 * @param coach
 * @param level
 * @param division
 */
public Team(String id, String name, String coach, String level, String division) {
	this.id = id;
	this.name = name;
	this.coach = coach;
	this.level = level;
	this.division = division;
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
 * @return the coach
 */
public String getCoach() {
	return coach;
}
/**
 * @param coach the coach to set
 */
public void setCoach(String coach) {
	this.coach = coach;
}
/**
 * @return the level
 */
public String getLevel() {
	return level;
}
/**
 * @param level the level to set
 */
public void setLevel(String level) {
	this.level = level;
}
/**
 * @return the division
 */
public String getDivision() {
	return division;
}
/**
 * @param division the division to set
 */
public void setDivision(String division) {
	this.division = division;
}


}
