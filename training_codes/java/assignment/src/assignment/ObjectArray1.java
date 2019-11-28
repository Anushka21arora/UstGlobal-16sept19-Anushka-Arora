package assignment;

public class ObjectArray1 {
   public static void main(String[] args) {
	Student s = new Student(1, "anu", 70);
	Student s1 = new Student(2, "jaggu", 80);
	Object[] o = new Object[2];
	o[0]=s;
	o[1]=s1;
	System.out.println("---for loop---");
	
	for(int i=0;i<o.length;i++)
	{
		System.out.println(o[i]);
	}
	System.out.println("---for each-----");
	for(Object obj:o) {
		System.out.println(obj);
	}
	
	
}
}
