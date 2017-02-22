package generics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Person person = new Person("Don Draper", 89);
		Person person1 = new Person("Peggy Olson", 75);
		Person person11 = new Person("Bert Cooper", 75);
		
		Map<String, Person> madMen = new HashMap<String, Person>();
		madMen.put(person.getName(), person);
		madMen.put(person1.getName(), person1);
		madMen.put(person11.getName(), person11);
		
		for(Map.Entry<String, Person> allperson : madMen.entrySet()){
			System.out.println(allperson.getValue().getName());
			System.out.println(allperson.getKey());
		}
	

		//System.out.println(person1.getName());
		//System.out.println(person11.getName());
	}

}
