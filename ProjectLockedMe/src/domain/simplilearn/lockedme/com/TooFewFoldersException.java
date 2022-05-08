package domain.simplilearn.lockedme.com;

public class TooFewFoldersException extends RuntimeException {
	/**
	 * 
	 * @param msg - To add the user defined exception when there are few
	 *            sub-directories in directory.
	 */

	public TooFewFoldersException(String msg) {
		super(msg);
	}
}
