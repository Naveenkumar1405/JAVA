public class TestFilter4 {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person(1,"Navin","navi@GmaIL.COM"));
		list.add(new Person(1,"Navi","navi@G"));
		list.add(new Person(1,"kavin","navi@Gm"));
		list.add(new Person(1,"pravin","navi@GmaIL"));
		
		List<Person> list2=(List<Person>) list.stream().filter(e -> e.getName().length());
		
		Consumer<Person> con= e -> System.out.println(e);
		
		list2.forEach(con);
		
	}
}
class Person{
	public Person(int i, String string, String string2) {
this.email=email;
this.name=name;
this.no=no;}
	public String getName() {
System.out.println(name);		return null;
	}
	int no;
	String name, email;
	
}
