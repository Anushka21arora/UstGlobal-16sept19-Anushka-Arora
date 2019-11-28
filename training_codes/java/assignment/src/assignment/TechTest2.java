package assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TechTest2 {
public static void main(String[] args) {
	Teacher t = new Teacher(1, "anu", "maths");
	Teacher t1 = new Teacher(2,"XYZ", "Science");
	LinkedList<Teacher> al = new LinkedList<Teacher>();
	al.add(t);
	al.add(t1);
	System.out.println("for loop");
	for(int i = 0 ;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	System.out.println("for each");
	for(Teacher tech: al) {
		System.out.println(tech);
	}
	System.out.println("iterator");
	Iterator<Teacher> itr = al.iterator();
	while (itr.hasNext()) {
		Teacher teacher =  itr.next();
		System.out.println(teacher);
	}
	System.out.println("listiterator");
	ListIterator<Teacher> litr= al.listIterator();
	while (litr.hasNext()) {
		Teacher teacher =  litr.next();
		System.out.println(teacher);
	}
}


}
