package domain.simplilearn.lockedme.com;

public class TooFewFilesInFolderException extends RuntimeException {
	/**
	 * 
	 * @param msg - To add the user defined exception when there are few files in
	 *            the directory.
	 */

	public TooFewFilesInFolderException(String msg) {

		super(msg);
	}
}
