public class SmallestNumberInArray {

	public static void main(String[] args) 
	{

		int[] a= {5,8,6,2,5,9};
		int small=a[0]; 
		
		for(int i=1;i<a.length;i++) if (a[i]<small) small=a[i];
		System.out.println(small);
		
		SecondSmallest();
	}
		public static void SecondSmallest() {
			int[]a= {5,6,5,7,8};
			
			int s1=a[0];
			int s2=a[0];
			
			for(int i=1;i<a.length;i++ ) 
			{
				if(a[i]<s1) {
					s2=s1;
					s1=a[i];}
					else if (s1==s2|| a[i]<s2) {s2=a[i];}
			}
			System.out.println(s2);
			}
	}

