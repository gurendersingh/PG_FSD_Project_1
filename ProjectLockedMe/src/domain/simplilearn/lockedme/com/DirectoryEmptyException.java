package domain.simplilearn.lockedme.com;

public class DirectoryEmptyException extends RuntimeException {

	/**
	 * 
	 * @param msg - To add the user defined exception when Directory is empty.
	 */
	public DirectoryEmptyException(String msg) {
		super(msg);
	}

}
