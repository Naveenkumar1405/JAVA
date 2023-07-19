class S{
	private static S t=null;
	private S() {}
	public static S getInstance() {if(t==null) t=new S();
	return t;}
}
public class SingleTonClass {

	public static void main(String[] args) {

				S s=S.getInstance();
				S s1=S.getInstance();
	}

}
