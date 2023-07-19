	public void m1() {
		System.out.println("m1()");
	}
	public void m2() {
		System.out.println("m2()");
	}
}
class B extends AA{
			public void m2() {
				System.out.println("m2() of B" );
			}
			public void m3() {
				System.out.println("m3()");
			}
}

public class TestCasting {

	public static void main(String[] args) {

					AA a= new B();
					a.m1();
					a.m2();
					B b = (B) a;
					b.m3();
	}

}
