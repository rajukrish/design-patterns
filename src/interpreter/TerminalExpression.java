package interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
	private String data;
	
	public TerminalExpression(String data){
		this.data = data;
	}
	
	@Override
	public boolean interpret(String str) {
		StringTokenizer st = new StringTokenizer(str);
		String test = st.nextToken();
		
		System.out.println(str);
		if(test.equals(data)){
			return true;
		}
		
		return false;
	}

}
