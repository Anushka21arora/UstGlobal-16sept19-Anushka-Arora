public class SubClass extends SuperClass{
	String s= "subclass variable";

	public SubClass() {
		System.out.println("subclass Constructor");
	}
	void getData()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("-------------------");
		super.superClassMethod();
		superClassMethod();
	}
}
