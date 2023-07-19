import java.util.*;

import com.Jsp.J2Ee.Person;

public class Helper implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
