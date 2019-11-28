package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestA {
public static void main(String[] args) {
Employee e = new Employee(1, "abc");
Employee e1 = new Employee(2, "xyz");
	ArrayList<Employee> al = new ArrayList<Employee>();
al.add(e);
al.add(e1);
System.out.println("forloop");
for(int i =0;i<al.size();i++) {
	System.out.println(al.get(i));
}
System.out.println("foreach");
for(Employee emp:al) {
	System.out.println(emp);
}
System.out.println("iterator");
Iterator<Employee> itr=al.iterator();
while (itr.hasNext()) {
	Employee employee =  itr.next();
	System.out.println(employee);
}
System.out.println("listiterator");
ListIterator<Employee> litr = al.listIterator();
System.out.println("forward");
while (litr.hasNext()) {
	Employee employee =  litr.next();
	System.out.println(employee);
}
System.out.println("backward");
while (litr.hasPrevious()) {
	Employee employee =  litr.previous();
	System.out.println(employee);
}
}
}
