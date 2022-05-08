package domain.simplilearn.lockedme.com;

public class NotDirectoryException extends RuntimeException {

	/**
	 * 
	 * @param msg - To add the user defined exception for No Directory.
	 */
	public NotDirectoryException(String msg) {
		super(msg);
	}

}
