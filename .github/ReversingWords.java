public class ReversingWords {

	public static void main(String[] args) {

		String s="Java is a oop language";
		String [] str= s.split(" ");
		String a=" ";
		for(a: str) System.out.println(a);
		
		for(int i=a.length()-1; i>=0;i--){
			s1=a[i];
			if(i>0)s1+=" ";
		}
		char[] a = s.toCharArray();

	}

}
