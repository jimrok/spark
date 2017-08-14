package spark.http.matching;

public class GeneralException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GeneralException(String message) {
		super(message);
	}
	
	@Override
	public synchronized Throwable initCause(Throwable cause) {
		return super.initCause(cause);
	}

}
