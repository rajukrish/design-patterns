package observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		
		phoneClient.addMessage("New message");

	}

}
