
public class Factorial {
	public static void main(String[] args) {
		int f = fact(5);
		System.out.println(f);
		
	}
	 static int fact(int num)
	{  
	   if(num==0)
		   return 1;
	   else
		  return num*(fact(num-1));
	   
	}

}
