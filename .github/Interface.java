public class Interface implements I,I2 {

	public static void main(String[] args) {
		I i=(I) new Interface();
		i.m1();
		I2 i1=(I2) new Interface();
		i1.m2();
		
		System.out.println(i1.equals(i));
		
	}
	@Override
	public void m2() {
		//I2.super.m2();
		System.out.println("Welcome");
	}

}
