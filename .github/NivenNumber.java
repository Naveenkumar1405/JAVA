import java.util.Scanner;
class NivenNumber
{
   public static void main(String[]args)
   {
	  System.out.println("Given number:");
	  int originalNumber=new Scanner(System.in).nextInt();
      int copyOfOriginalNumber = originalNumber;
      int sum = 0;
      while(originalNumber > 0)
      {
         int rem = originalNumber%10;
         sum+= rem;
         originalNumber/= 10;
      }
      if(copyOfOriginalNumber % sum == 0)
         System.out.println(copyOfOriginalNumber+" is a niven number");
      else
         System.out.println(copyOfOriginalNumber+" is not a niven number");
   }
}