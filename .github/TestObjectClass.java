class Student extends Object
{
	int id;
	String name;
	int age;
	
	public Student (int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		return "Student[Id :"+id+", Name :"+name+", Age :"+age+"]";
	}
	public boolean equals (Object arg)
	{
		if(!(arg instanceof Student))return false;
		Student s=(Student)arg;
		return this.id==s.id && this.name.equals(s.name)&& this.age==s.age;		
	}
}

public class TestObjectClass 
{
	public static void main(String[] args) 
	{
		Student s1=new Student (1,"Navin",23);
		System.out.println(s1);
		
		Student s2 =new Student(1,"Navin",23);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
