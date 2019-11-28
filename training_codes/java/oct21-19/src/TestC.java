public class TestC {
public static void main(String[] args) {
	Person p = new Person();
	p.name="Anushka";
	Person.color="fair";
	p.age=22;
	Person.sleep();
	System.out.println("Person name is "+p.name);
	System.out.println("Person color is "+Person.color);
	System.out.println("Age is"+p.age);
	p.eat();
	p.walk();
}
}
