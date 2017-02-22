	package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<Person> madMen = new ArrayList<Person>();

		Person donDrapper = new Person("Don Draper", 89);
		Person peggyOlson = new Person("Peggy Olson", 75);
		Person bertCooper = new Person("Bert Cooper", 100);
		
		madMen.add(donDrapper);
		madMen.add(peggyOlson);
		madMen.add(bertCooper);
		
		//for normal sort
		Collections.sort(madMen,new AgeComparator());
		
		//for reverse sort
		//Collections.sort(madMen,new ReverseComparator<Person>(new AgeComparator()));
		
		Iterator<Person> castIterator = madMen.iterator();
		
		while(castIterator.hasNext()){
			Person castInfo = castIterator.next();
			System.out.println(castInfo.getName() + " " + castInfo.getAge());
		}
		
		Person youngestCastMember = min(madMen,new AgeComparator());
		
		System.out.println(youngestCastMember.getName() + " " + "is the youngest member");
	}

	private static <T> T min(List<T> madMen, Comparator<T> ageComparator) {
		
		if(madMen.isEmpty()){
			throw new IllegalArgumentException("List is empty");
		}
		
		T lowestElement = madMen.get(0);
		
		for(int i=1; i<madMen.size(); i++){
			T element = madMen.get(i);
			
			if(ageComparator.compare(element,lowestElement) < 0){
				lowestElement = element;
			}
		}
		return lowestElement;
	}

}
