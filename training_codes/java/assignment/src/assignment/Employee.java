package assignment;

public class Employee {
int eid;
String ename;
public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + "]";
}

}
