public class Student {
	String name;
	int sid;
	long contactNo;
	String email;
	int age;
	public Student(String name,int sid, long contactNo,String email,int age)
	{
		this.name=name;
		this.sid=sid;
		this.contactNo=contactNo;
		this.email=email;
		this.age=age;
	}
	  void display()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student ID"+sid);
		System.out.println("contact number:"+contactNo);
		System.out.println("Email: "+email);
		System.out.println("Age is"+age);
	}
	 public static void main(String[] args) {
		Student s= new Student("Anu", 1, 7415500572l, "anu@gmail.com", 22);
		s.display();
		Student s1= new Student("reshu", 2, 234567l, "reshu@gmail.com", 22);
		s1.display();
		Student s2= new Student("pri", 3, 6789544l, "pri@gmail.com", 23);
		s2.display();
		Student s3= new Student("pari", 4, 3455465l, "pari@gmail.com", 24);
		s3.display();
		Student s4= new Student("divi", 5, 7124354l, "divi@gmail.com", 24);
		s4.display();
		Student s5= new Student("jaggu", 6, 32564657l, "jaggu@gmail.com", 22);
		s5.display();
		Student s6= new Student("karan", 7, 2354365476l, "karan@gmail.com", 22);
		s6.display();
		Student s7= new Student("maira", 8, 2353462l, "maira@gmail.com", 22);
		s7.display();
		Student s8= new Student("sid", 9, 2435435l, "sid@gmail.com", 26);
		s8.display();
		Student s9= new Student("abc", 10, 325464657l, "abc@gmail.com", 21);
		s9.display();
	   
		
	 
	 
	 
	 }

}
