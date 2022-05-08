package domain.simplilearn.lockedme.com;

import java.io.File;
import java.io.IOException;

public class FileOperation {

	/**
	 * 
	 * @param p_dirname - The user entered directory name, where file needs to be
	 *                  added.
	 * @param p_fname   - The file name that has to be created, along with
	 *                  extension.
	 */

	public void addfiletoDir(String p_dirname, String p_fname) {

		File f = new File(p_dirname, p_fname);
		try {
			if (f.createNewFile()) {
				System.out.println("File created successfully!!");
			} else {
				System.out.println("File creation error!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param p_dirname - The user entered directory name, where file needs to be
	 *                  deleted.
	 * @param p_fname   - The user entered file name that has to be deleted, along
	 *                  with extension.
	 */
	public void deletefilefromDir(String p_dirname, String p_fname) {

		File f = new File(p_dirname);
		boolean found = false;

		if (f.isDirectory()) {
			String[] files = f.list();
			for (String s : files) {
				if (s.equals(p_fname)) {
					found = true;
					break;
				} else {
					found = false;
				}
			}
			if (found) {
				File f1 = new File(f, p_fname);
				if (f1.delete()) {
					System.out.println("File Deleted Successfully!!");
				}

			} else {
				System.out.println("File Not Found.");
			}
		} else {
			throw new NotDirectoryException("Not a Directory,search not possible.");
		}

	}

	/**
	 * 
	 * @param p_dirname - The user entered directory name, where file needs to be
	 *                  deleted.
	 * @param p_fname   - The file name that has to be searched in the directory.
	 */
	public void searchfileinDir(String p_dirname, String p_fname) {

		File f = new File(p_dirname);
		boolean found = false;
		if (f.isDirectory()) {
			String[] files = f.list();
			for (String s : files) {
				if (s.equals(p_fname)) {
					found = true;
					break;
				} else {
					found = false;
				}
			}
			if (found == true) {
				System.out.println(p_fname + " found successfully !!!.");
			} else {
				System.out.println(p_fname + " not found, try another file !!!.");
			}
		} else {
			throw new NotDirectoryException("Not a Directory,search not possible.");
		}
	}
}
