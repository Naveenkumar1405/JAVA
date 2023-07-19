public class AddingElementsInArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4};
		int sum=0;
		String s1="";
		
		for(int i=0;i<a.length;i++) { 
		sum+=a[i];
		s1+=a[i];
		if(i<a.length-1) s1+="+";}
		s1=s1+"="+sum;
		System.out.println(s1);
	}

}
