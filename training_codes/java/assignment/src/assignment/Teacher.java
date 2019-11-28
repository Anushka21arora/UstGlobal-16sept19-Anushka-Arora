package assignment;

public class Teacher {
int id;
String name;
String subject;
public Teacher(int id, String name, String subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}
@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
}


}
