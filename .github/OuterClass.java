public class OuterClass {
	
	static String message="Message from outer class";
	
	public static void outer() {
		System.out.println("Outer class Method");
	}
	
	public void display() {
		System.out.println("Display Method");
	}
	//we can access private member of outer class in inner class because inner class is a member of outer class
	

public static class InnerClass
{
	public static void innerMethod() {
		
		System.out.println("Inner Method");
	}
	public void nonStatic() {
		System.out.println("Non static Inner Method");
	}

	}

}
