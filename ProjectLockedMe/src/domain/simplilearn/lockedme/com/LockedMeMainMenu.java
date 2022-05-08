package domain.simplilearn.lockedme.com;

import java.util.Scanner;

public class LockedMeMainMenu {
	/**
	 * 
	 * @param args - Main Method
	 */

	public static void main(String[] args) {

		System.out.println("/*************************************************");
		System.out.println("** Welcome to first prototype for LockedMe.com **");
		System.out.println("** Author - Gurender Singh                     **");
		System.out.println("** Date - May 03, 2022                         **");
		System.out.println("** Full Stack Development March 2022 batch     **");
		System.out.println("** Copyright 2022 - All rights reserved!!      **");
		System.out.println("*************************************************/");

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("/************************ Main Menu **********************/");
			System.out.println("1 - Show Files and Folders in Ascending order.");
			System.out.println("2 - Add/Delete/Search/Navigate back files in the directory.");
			System.out.println("9 - Exit the application.");
			System.out.println();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();// accept user input

			switch (choice) {

			case 1:
				FileSortOperation fso = new FileSortOperation();
				System.out.print("Enter the Directory Name:");
				System.out.println();
				String dirName = scan.next();
				fso.SortFiles(dirName);
				break;
			case 2:
				FileOperation fop = new FileOperation();

				while (true) {

					System.out.println("===== Option-2 Menu =====");
					System.out.println("3 - Add new file.");
					System.out.println("4 - Delete file.");
					System.out.println("5 - Search file.");
					System.out.println("6 - Return to Main Menu.");
					System.out.println();
					System.out.println("Enter your choice:");
					int ch = scan.nextInt();

					if (ch == 3) {
						System.out.print("Enter the name of the directory:");
						String dirname_ = scan.next();
						System.out.println();
						System.out.print("Enter the name of the file to be created:");
						String fname = scan.next();
						fop.addfiletoDir(dirname_, fname);
					} else if (ch == 4) {
						System.out.print("Enter the name of the directory:");
						String dirname1 = scan.next();
						System.out.println();
						System.out.print("Enter the name of the file to be deleted:");
						String f_to_be_deleted = scan.next();
						fop.deletefilefromDir(dirname1, f_to_be_deleted);
					} else if (ch == 5) {
						System.out.print("Enter the name of the directory:");
						String dir_to_be_searched = scan.next();
						System.out.println();
						System.out.print("Enter the name of the file to be searched:");
						String f_to_be_searched = scan.next();
						fop.searchfileinDir(dir_to_be_searched, f_to_be_searched);
					} else if (ch == 6) {
						break;
					} else {
						System.out.println("Invalid Input.Enter Correct Input!!.");
					}
				}
				break;
			case 9:
				System.out.println("Exiting the application....");
				System.out.println("Application Closed,Bye!!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input. Only 1/2/9 is allowed.");
			}

		}
	}
}
