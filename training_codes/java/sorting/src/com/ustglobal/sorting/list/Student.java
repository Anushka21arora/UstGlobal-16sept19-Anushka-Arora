package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	int id ;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
//public int compareTo(Student o) {
//	if(this.id>o.id)
//		return 1;
//	else if(this.id<o.id)
//		return -1;
//	else
//		return 0;


//}
//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.percentage>s.percentage) {
//			return 1;
//			
//		}else if (this.percentage<s.percentage) {
//			return -1;
//		}else
//			return 0;
//	}
//
//}
	@Override
	public int compareTo(Student s) {
//		String s1 = this.name.toLowerCase();
//		String s2 = s.name.toLowerCase();
//		return s1.compareTo(s2);
//		return this.name.compareToIgnoreCase(s.name);
		Integer i = this.id;
		Integer j= s.id;
		return i.compareTo(j);
	}

}
