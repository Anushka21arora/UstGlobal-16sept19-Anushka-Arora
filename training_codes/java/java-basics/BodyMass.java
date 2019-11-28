 class BodyMass
 { 
      public static void main (String[] args){
       int weight = 62;
	   double height = 1.52;
	   double bmi = weight/(height*height);
	   System.out.println(bmi);
	   if(bmi<=18.5)
	   {
		   System.out.println("you are the underweight range");
		   
	   }
	   else if(bmi<=24.9&& bmi>=18.5)
	   {
		   System.out.println("you are healthy weight range");
		  
	   }
	    else if(bmi<=29.9&& bmi>=25)
	   {
		   System.out.println("you are healthy overweight range");
		  
	   }
	    else if(bmi<=39.9 && bmi>=30)
	   {
		   System.out.println("you are healthy obese range");
		  
	   }
 }
 }