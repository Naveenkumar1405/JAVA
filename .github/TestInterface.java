interface I
{
	double PI=3.14;
	void m1();
	void m2();
}


class A implements I
{	
	@Override
	public void m1() { System.out.println("M1() OF CLASS A");}

	@Override
	public void m2() {	System.out.println("M2() OF CLASS A");}
	
	public void m3() {System.out.println("M3() OF CLASS A");}
}
class B extends A 
{
	@Override
	public void m3() {System.out.println("M3() OF CLASS B");}
	
	public void m4() {System.out.println("M4() OF CLASS B");}
}

public class TestInterface 
{
	public static void main(String[] args) 
	{
				System.out.println(I.PI);
				I i =new A();
				i.m1();
				i.m2();
				
				((A)i).m3();
				
				A a =new B();
				a.m3();
				
				((B)a).m4();
	}
}