package com.greedy.section03.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

	public static void main(String[] args) {

		/* key value를 문자열로 하여 hashmap 처럼 사용한다. */
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("user", "C##STUDENT");
		prop.setProperty("password", "STUDENT");
		
		System.out.println(prop);
		
		try {
			
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Properties prop2 = new Properties();
		
		System.out.println(prop2);
		
		try {
//			prop2.load(new FileInputStream("driver.dat"));
//			prop2.load(new FileReader("driver.txt"));
			prop2.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop2);
			
			System.out.println(prop2.getProperty("driver"));
			System.out.println(prop2.getProperty("url"));
			System.out.println(prop2.getProperty("user"));
			System.out.println(prop2.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
