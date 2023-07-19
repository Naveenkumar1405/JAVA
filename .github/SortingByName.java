import java.util.*;
public class SortingByName {
	public static void main(String[]args) {
		List<Person> list=new ArrayList<>();
		
		list.add(new Person(1,"Navin","Navi@gmail.com"));
		list.add(new Person(2,"Yogesh","Yogesh@gmail.com"));
		list.add(new Person(3,"Harsha","Harsha@gamil.com"));
		list.add(new Person(4,"Chakra","chakri@gamil.com"));
		list.add(new Person(5,"Pavan","Pavan@gmail.com"));
		
		Comparator<Person> com=(e1,e2)->{
			return e1.getName().compareToIgnoreCase(e2.getName());
		};
		
		Collections.sort(list,com);
		
		for(Person p:list) { System.out.println(p);}
		}
		}
		class Person 
		{
		private int id;
		private String name;
		private String email;

	
		public Person(int id, String name, String email) 
		{
			
			this.id = id;
			this.name = name;
			this.email = email;
		}
		public int getId() { return id; }
		public void setId(int id) { this.id = id; }
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
		public String getEmail() { return email; }
		public void setEmail(String email) { this.email = email; 
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
		}
		
		}
		

