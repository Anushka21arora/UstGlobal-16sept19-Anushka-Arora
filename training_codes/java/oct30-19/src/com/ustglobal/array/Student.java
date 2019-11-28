package com.ustglobal.array;

public class Student {
int id ;
String name;
double percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}

static void receive(Student[] stu) {
	for(Student s:stu) {
		System.out.println(s);
	}
}
}
