public class TestF {
	final void add()
	 {
		 System.out.println("add(int a) method");
	 }
	 final void add(int a)
	 {
		 System.out.println("add (int a) method");
	 }
	public static void main(String[] args) {
 
		SuperClass sup = new SuperClass();
		System.out.println("---------------------");
		SubClass sub = new SubClass();
		sub.getData();
	}
}
