
public class TestA {
 public static void main(String[] args) {
	Pen p = new Pen();
	p.cost=100;
	p.color="black";
	p.brand="Parker";
	System.out.println("cost is"+p.cost);
	System.out.println("color is "+p.color);
	System.out.println("brand is "+p.brand);
	p.write();
	
	System.out.println("*******************");
	Van v = new Van();
	v.cost=500000;
	v.color="white";
  System.out.println("van cost is "+v.cost);
  System.out.println("van color is "+v.color);
  v.move();
	System.out.println("*******************");
	Van v1 = new Van();
	v1.color="black";
	v1.cost=30000;
	System.out.println(v1.cost);
	System.out.println(v1.color);
	
	
}
}