{
	public void m1() {System.out.println("M1");}
    public abstract void m2();
    public abstract void m3();
}
class Demo2 extends Demo
{	
	@Override
	public void m2() {System.out.println("M2");}
	@Override
	public void m3() {System.out.println("M3");}
}
public class AbstractClass 
{
	public static void main(String[] args) 
	{
	 Demo a=new Demo2();
	 a.m1();
	 a.m2();
	 a.m3();
	}
}
