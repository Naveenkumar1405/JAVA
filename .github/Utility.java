public class Utility {
		public static int factorial(int num)
		{
			int fact = 1;
			for(int i=1;i<=num;i++) fact*=i;
			return fact;
		}
		public static int length(int num)
		{
			int count;
			for(count = 0;num>0;num/=10) count++;
			return count;
		}
		public static int power(int base,int exp)
		{
			int res = 1;
			for(int i=1;i<=exp;i++) res *= base;
			return res;
		}
		public static int armStrong(int num)
		{
			int len = length(num);		
			int res = 0;
			for(;num>0;num/=10) res  += power(num % 10,len);
			return res;
		}
		public static int strong(int num)
		{
			int res = 0;
			for(;num>0;num/=10) res = res + factorial(num % 10);
			return res;	
		}
	}
