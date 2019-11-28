class TestG
{
        public static void main (String[] args)
        {
            char grade='F';`
             switch(grade)
            {
              case 'A' : System.out.println("FCD");
                            break;
              case 'B' : System.out.println("FC");
                           break;
              case 'C' : System.out.println("SC");
                            break;
              case 'D' : System.out.println("PASS");
                            break;
              case 'E' : System.out.println("Fail");
                            break;
              default : System.out.println("Invalid Grade");
                
            }
        }
}