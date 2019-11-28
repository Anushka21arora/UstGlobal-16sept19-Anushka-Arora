class TestL
{
 public static void main(String[] args)
{
       int radius=10;
       int num =4;
       int f = factorial(num);
      double d= area(radius);
      double e= circum(radius);
      boolean res =oddEven(num);
  if(res)
   System.out.println("even");
 else
  System.out.println("odd");

greeting("hello hii i m hungry");

 
System.out.println("Area "+d);
System.out.println("Circumference "+e);
System.out.println("Factorial of no is "+f);
  
}
static double area(int r)
{
    double rad = 3.14*r*r;
   return rad;
}
static double circum(int r)
{
    double c = 2*3.14*r;
   return c;
}
 static boolean oddEven(int number)
{
   if(number%2==0)
   return true;
  else
return false;
}
static int factorial(int number)
{

   int fact=1;
   for (int i=1; i<=number;i++)
{
    fact= fact*i;
}
return fact;
}

 static void greeting(String msg)
{
 System.out.println(msg);

}
}