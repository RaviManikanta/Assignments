package com.yash.ass_collections_studentapp;

import java.util.Objects;

public class Student 
{
 int id;
 String name;
 int standard;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, name, standard);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Student))
		return false;
	Student other = (Student) obj;
	return id == other.id && Objects.equals(name, other.name) && standard == other.standard;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public Student(int id, String name, int standard) {
	super();
	this.id = id;
	this.name = name;
	this.standard = standard;
}
 
 
}
