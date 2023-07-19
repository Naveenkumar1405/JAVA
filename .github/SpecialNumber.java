import java.util.Scanner;  
class SpecialNumber
{  
public static void main(String args[])   
{  
System.out.print("Enter a Number : ");  
int n= new Scanner(System.in).nextInt();  
int num=n, sum=0;
while (n>0)
{
	int d=n%10;
	sum+=d;
	n/=10;
}
System.out.println("Sum the digits is ="+sum);
int  res=sum,count=0;
while (sum>0)
{
	int rem=sum%10;
	count=count*10+rem;
	sum/=10;
}
	System.out.println(count);
	int total=(count*res);
	System.out.println(total);
if(num==total) System.out.println(num+ " is a special number.");    
else System.out.println(num+ " is not a special number.");   
}  
}  