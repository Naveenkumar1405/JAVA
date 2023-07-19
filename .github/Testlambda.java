public class Testlambda  {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	DataConverter dc=(e1,e2,e3)->{
		return e1+e2+e3+"";
	};
	System.out.println(dc.convertor(a,b,c));
}
}
