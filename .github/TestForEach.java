import java.util.ArrayList;

public class TestForEach {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(93);
		list.add(33);
		list.add(38);
		list.add(59);
		list.add(62);
		 
		List<Integer> l2 = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		l2.forEach(e-> System.out.println(e*e));		
		
		
	}
}
