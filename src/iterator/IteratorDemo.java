package iterator;

import java.util.Iterator;

public class IteratorDemo {

	
	public static void main(String[] args) {
		
		BikeRepository repo = new BikeRepository();
		
		repo.addBike("bike1");
		repo.addBike("bike2");
		repo.addBike("bike3");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		while(bikeIterator.hasNext()){
			String biker = bikeIterator.next();
			System.out.println(biker);
			bikeIterator.remove();
		}
		
		//same as above while loop
		//for (String bike : repo) {
			//System.out.println(bike);
		//}
	}

}
