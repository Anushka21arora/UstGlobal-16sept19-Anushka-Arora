package assignment;

public class ObjectArray {
public static void main(String[] args) {
	Object[] o = {10,20.5,"anu",'a',true};
	System.out.println("------forloop-----");
	for(int i=0;i<o.length;i++) {
		System.out.println(o[i]);
	}
    System.out.println("----foreach----");
    for(Object obj:o) {
    	System.out.println(obj);
    }
  
}


}
