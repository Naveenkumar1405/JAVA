class A{
	int i;
	public A() {
		this.i=5;
	}
	public void display() {
		System.out.println("I = "+ i);
	}
}
class Hello
{
	public Hello(int s)
	{
	System.out.println("Number");	
    }
    public Hello(String n)
    {
	System.out.println("Alphabet");
	}
 }

public class Constructor {

	public static void main(String[] args) {
		
		new Hello(10);
		new Hello("A");
		A a1=new A();
		a1.display();
	}

}
