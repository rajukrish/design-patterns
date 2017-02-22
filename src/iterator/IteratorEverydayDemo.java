package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorEverydayDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		//Set<String> names = new TreeSet<String>();
		
		names.add("Hero");
		names.add("Raju");
		names.add("Raju");
		
		Iterator<String> namesItr = names.iterator(); 
		
		while(namesItr.hasNext()){
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}
		
		System.out.println("Names size " + names.size());
	}

}
