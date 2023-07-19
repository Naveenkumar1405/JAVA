public class ZeroToOne {

	public static void main(String[] args) {
		
			int one='A'/'A';
			for(int i=one;i<='d';i++)System.out.println(i);
	
	System.out.println("ENTER A NUMBER :");
	int n=new Scanner(System.in).nextInt();
	int rev=0;
	for(;n>0;n/=10) rev=rev*10+(n%10);
	System.out.println(rev);
	}

}
