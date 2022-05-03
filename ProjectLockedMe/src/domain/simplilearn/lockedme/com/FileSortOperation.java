package domain.simplilearn.lockedme.com;

import java.io.File;

public class FileSortOperation {

	public void SortFiles(String m_dirName) {

		File f = new File(m_dirName);
		String[] file_name = f.list(); // List the names of the files in the directory
		int count = 0;
		int file_counter = 0;
		int dir_counter = 0;
		for (String s : file_name) {
			count++;

			File f1 = new File(f, s);

			if (f1.isFile()) {
				file_counter++;
			} else {
				dir_counter++;
			}
		}

		if (count == 0) {
			throw new DirectoryEmptyException("Directory is Empty, it doesnot contain any files or folders");
		} else {

			if (file_counter <= 5) {
				throw new TooFewFilesInFolderException(
						"Too few files in the directory, files count should be greater than 5.");
			}

			if (dir_counter <= 2) {
				throw new TooFewFoldersException(
						"Too few sub-folders in the folder, sub-folders should be greater than 2.");
			}
		}
		System.out.println("There are " + file_counter + " files in the folder.");
		System.out.println("There are " + dir_counter + " sub-folders in the directory.");

		System.out.println("=== Sorted List of Files/Folders names ===");
		for (String s1 : file_name) {
			System.out.println(s1);
		}

	}

}
