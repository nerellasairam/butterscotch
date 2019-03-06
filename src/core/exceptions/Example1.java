package core.exceptions;

public class Example1 {

	public static void main(String[] args) {
		

		
		try {
			callMe();
		} catch (ExtendException e) {
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
		

	}
	
	
	
	static void callMe() throws ExtendException{
		
try {
			
			int a=25/0;
		}
		catch(ArithmeticException e) {
			
			throw new ExtendException("localized mesage"+e,"100");
			
		}
		
	}

}
