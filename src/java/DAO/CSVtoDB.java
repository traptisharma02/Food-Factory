/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author DELL
 */
public class CSVtoDB {
    public static void main(String[] args) {
        readAllDataAtOnce("D://output.csv");
    }
    // Java code to illustrate reading a 
// all data at once 
public static void readAllDataAtOnce(String file) 
{ 
	try { 
		// Create an object of file reader 
		// class with CSV file as a parameter. 
		FileReader filereader = new FileReader(file); 

		// create csvReader object and skip first Line 
		CSVReader csvReader = new CSVReader(filereader) ;
								
		List<String[]> allData = csvReader.readAll(); 

		// print Data 
		for (String[] row : allData) { 
			for (String cell : row) { 
				System.out.print(cell + "\t"); 
			} 
			System.out.println(); 
		} 
	} 
	catch (Exception e) { 
		e.printStackTrace(); 
	} 
} 

    
}
