package core.exceptions;

public class ExtendException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}

	 

	public ExtendException(String message, String errorCode){
		
		super (message);
		this.errorCode=errorCode;
	}
	
	 
	
}
