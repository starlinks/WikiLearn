//  Archana Venkatesh
// September 3, 2013
// OpenFile.java
// Create some utilities for opening a 
//text file both for reading from and 
//and writing to
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;

//import java.io.*;

public class OpenFile
{
	public static Scanner openToRead(String filestring)
	{
		Scanner fromfile = null;
		File filename = new File(filestring);
		try
		{
		 fromfile = new Scanner(filename);
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\n\n\n Sorry but no such file was found\n\n\n");
			System.exit(1);
		}
		return fromfile;
	}
	public static PrintWriter openToWrite(String filestring)
	{
		PrintWriter outfile = null;
		try
		{
		//	FileWriter fstream = new FileWriter(filestring);
			outfile = new PrintWriter(filestring);//fstream);
		}
		catch(Exception e)
		{
			System.out.println("\n\n\n\n\nSorry but the file could not be created\n\n");
			System.exit(1);			
		}
		return outfile;
	}
	
}