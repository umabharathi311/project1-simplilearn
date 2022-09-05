package LockedMe.com;

import java.util.Scanner;

public class clientproject {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int ch;
		
		lockedMe.displayMenu();
		System.out.println("Enter your choice");
		ch=Integer.parseInt(obj.nextLine());
		switch(ch)
		{
		case 1:lockedMe.getAllFiles();
		break;
		case 2:lockedMe.createFiles();
		break;
		case 3:lockedMe.deleteFiles();
		break;
		case 4:lockedMe.searchFile();
		break;
		
		}
		obj.next();
		obj.close();

	}

}
