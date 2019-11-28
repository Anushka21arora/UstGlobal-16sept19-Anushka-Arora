package com.ustglobal.sorting.list;

public class Customer {
String name;
int id;
double salary;
public Customer(String name, int id, double salary) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}

}
