import java.util.Scanner;
class EvenOddDigits
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int n, sumO=0,sumE=0,rem;
      System.out.print("Enter your Number : ");
      int num=s.nextInt();
      n=num;
      while(num>0)
      {
        rem=num%10;
        if(rem%2==0)
        {
            sumE+=rem;
        }
        else
        {
            sumO+=rem;
        }
        num/=10;
     }
    System.out.println("Sum of even digits in "+n+" is "+sumE);
    System.out.println("Sum of odd digits in "+n+" is "+sumO);
  }
}