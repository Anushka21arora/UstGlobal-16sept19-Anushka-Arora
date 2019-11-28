
public class TestA {
	
	public static int add(int a,int b)
	{
		System.out.println("add(int a , int b) method");
		return a+b;
	}
	public static long add(byte a,int b)
	{
		System.out.println("add(int a , int b) method");
		return a+b;
	}
	public int multiply (int a, int b)
	{   System.out.println("multiply(int a , int b) method");
		return a+b;
	}
	public int multiply (byte a, int b)
	{   System.out.println("multiply(byte a , int b) method");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main (String[] args)");
		main(10);
		add(10, 5);
		add(3, 5);
		TestA ta = new TestA();
		ta.multiply(10, 10);
		ta.multiply(4, 2);
	}
	public static void  main(int a)
	{
		System.out.println("main (int a) method");
	}

}
