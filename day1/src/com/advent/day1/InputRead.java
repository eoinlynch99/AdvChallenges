package com.advent.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputRead {


	public static void main(String[] args) throws IOException {
		
		int num1 =0;
		int num2 =0;
		int greater = 0;
		
		ArrayList<String> file1 = new ArrayList<String>();
		
		BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
		
        String line = bf.readLine();
        
        // checking for end of file
        while (line != null) {
            file1.add(line);
            line = bf.readLine();
        }
       
        // closing bufferreader object
        bf.close();
       
        String[] fileArray = file1.toArray(new String[0]);
              
        
        for (int i = 0; i < fileArray.length -1; i++) {
        	num1 = Integer.valueOf(fileArray[i]);
        	num2 = Integer.valueOf(fileArray[i+1]);
        		
        	if(num1 < num2) {
        		greater++;	
        	}
        }
        
       
        System.out.println(greater);
	}
}
