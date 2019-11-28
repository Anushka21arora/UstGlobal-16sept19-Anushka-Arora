public class Employee {
	String name;
	int eid;
	public Employee(String ename, int eeid) {
		name= ename;
		eid = eeid;
	}
	void printDetails() 
	{
		System.out.println("Employee name is"+name);
		System.out.println("Employee id is"+eid);
	}
	public static void main(String[] args) {
		Employee e = new Employee("anu",234);
		e.printDetails();
		Employee e1 = new Employee("vaibhav",123);
		e1.printDetails();
		Employee e2 = new Employee("pradeep", 567);
		e2.printDetails();

	}
}
