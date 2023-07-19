class AAA{
	int i;
	public AAA() {}
	public AAA(int i) {this.i=i;}
	public AAA(AAA a) {this.i=a.i;}
}

public class CopyConstructor {

	public static void main(String[] args) {
				AAA a1=new AAA(15);
				AAA a2=new AAA(a1);
				AAA a3=new AAA(a1);
				
				System.out.println(a2);
				System.out.println(a3);
	}

}
