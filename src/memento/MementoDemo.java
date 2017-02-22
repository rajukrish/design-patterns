package memento;

public class MementoDemo {

	public static void main(String[] args) {
		
		CareTaker caretaker = new CareTaker();
		
		Employee emp = new Employee();
		
		emp.setName("John Woozo");
		emp.setAddress("100 XYZ street");
		emp.setPhone("123434567");
		
		System.out.println("Employee before save " + emp.getName() + " " + emp.getPhone());
		
		caretaker.save(emp);
		
		emp.setPhone("098765434");
		
		caretaker.save(emp);
		
		System.out.println("Employee after phone changed " + emp.getName() + " " + emp.getPhone());
		
		caretaker.revert(emp);
		
		System.out.println("Employee after revert " + emp.getName() + " " + emp.getPhone());
		
		caretaker.revert(emp);
		
		System.out.println("Employee to original " + emp.getName() + " " + emp.getPhone());
	}

}
	