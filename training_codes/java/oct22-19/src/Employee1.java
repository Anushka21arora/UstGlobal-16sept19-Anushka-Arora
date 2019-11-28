
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name, int eid) {
		this.name= name;
		this.eid = eid;
	}
	void printDetails() 
	{
		System.out.println("Employee name is"+name);
		System.out.println("Employee id is"+eid);
		this.sayHello();
	}
	void  sayHello()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Employee1 e = new Employee1("anu",234);
		e.printDetails();
		Employee1 e1 = new Employee1("vaibhav", 123);
		e1.printDetails();
		Employee1 e2 = new Employee1("pradeep",4567);
		e2.printDetails();
}
}
