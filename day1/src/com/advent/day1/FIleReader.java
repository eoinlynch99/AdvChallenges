package com.advent.day1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	// FileName
	String fileName;
	File fileExample;
	String line;
	String line2;
	
	int val1;
	int val2;
	
	int count;
	String strCount;
	
	
	// the constructor takes in the file name
	public FileReader (String fileName)
	{
		this.setFileName(fileName);
	}
	
	
	// open the file
	public void openFile()
	{
		fileExample = new File(fileName);
	}
	
	// read a line from the file, return the line as a String
	public String readLine()
	{
		try {
			Scanner myScanner = new Scanner(fileExample);
			
			if (myScanner.hasNextLine())
			{
				System.out.println(".");
				line2 = line;
				line = myScanner.nextLine();
				
				if (line != "no line in file" | line != "") {
					val1 = Integer.valueOf(line2);
					val2 = Integer.valueOf(line);
				
					if(val1 > val2)
					{
						count++;
					}
				}
			}
			
			myScanner.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.print(e.getMessage());
		}
		
		if (line != "no line in file") {
		strCount = String.valueOf(count);
		}
		
		System.out.println("strCount");
		return strCount;
	}

	
	// getters and setters
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public File getFileExample() {
		return fileExample;
	}

	public void setFileExample(File fileExample) {
		this.fileExample = fileExample;
	}
}
