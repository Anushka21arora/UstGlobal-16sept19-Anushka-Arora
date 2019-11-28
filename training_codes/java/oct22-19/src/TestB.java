
public class TestB {
	static int a=10;
	int x;
   public static void add() {
	 
	  final int b=20;
	   System.out.println(a);
	   System.out.println(b);
	   
   }
   public static void main(String[] args) {
	add();
	TestB b= new TestB();
	System.out.println("x value is "+b.x);
}
}
