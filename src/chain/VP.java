package chain;

public class VP extends Handler{

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.PURCHASE){
			if(request.getAmount() <= 1500){
				System.out.println("VP can approve upto amount " + request.getAmount());
			}
			else{
				successor.handleRequest(request);
			}
		}
		
	}

}
