package LockedMe.com;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class lockedMe
{
	static final String projectFilePath="E:\\simplilearn project\\LockedMe";
	
	public static void displayMenu()
	{
		System.out.println("*******************************************************");
		System.out.println("\t\tWelcome to LockeMe.com");
		System.out.println("\t\tDeveloper Name:Umabharathi ");
		System.out.println("*******************************************************");
		System.out.println("\t\t\t1.Display all Files");
		System.out.println("\t\t\t2.Add a File");
		System.out.println("\t\t\t3.Delete a File");
		System.out.println("\t\t\t4.Search a File");
		System.out.println("\t\t\t5.Exit");
		System.out.println("*******************************************************");
		
	}
	
	public static void getAllFiles()
	{
		File folder = new File(projectFilePath);
		File[]listoffiles = folder.listFiles();
		//if folder is empty
		if(listoffiles.length==0)
			System.out .println("No files exists in the Directory");
		else
		{
			for(var l:listoffiles)
			{
				System.out.println(l.getName());
			}
		}
				
	}
	
	public static void createFiles()
	{
	try 
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file name: ");
			fileName = obj.nextLine();
			int linesCount;
			System.out.println("Enter how many lines in the file");
			linesCount = Integer.parseInt(obj.nextLine());
			
			FileWriter fw =new FileWriter(projectFilePath+"\\"+fileName);
				for(int i=1;i<=linesCount;i++)
				{
					System.out.println("Enter the content line:");
					fw.write(obj.nextLine()+"\n");
				}
				System.out.println("File Created sucessfully");
				fw.close();
		}
	catch (Exception ex)
		{
		 	System.out.println("some error occured.");
		}
		
	}
	public static void deleteFiles()
	{
		Scanner obj =new Scanner(System.in);
		try
		{
		String fileName;
		System.out.println("Enter file name to be Deleted:");
		fileName=obj.nextLine();
		File f1 =new File(projectFilePath+"\\"+fileName);
			if(f1.exists())
			{	
			f1.delete();
			System.out.println("File Deleted Sucessfully");
			}
			else
			{
				System.out.println("File do not exists");
			
			}
		}
		catch(Exception ex)
		{
			System.out.println("Some error Ocurred");
	
		}	
	}
	public static void searchFile()
	{
		Scanner obj = new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Enter a file name to be searched");
			fileName=obj.nextLine();
			File f1 = new File(projectFilePath+"\\"+fileName);
				if(f1.exists())
				{
					System.out.println("File is availabel");
				}
				else
				{
					System.out.println("File doesn't exists");
					
				}
			
		}
		catch(Exception Ex)
		{
			System.out.println("Some error occured");
		}
	}
	
	
}
