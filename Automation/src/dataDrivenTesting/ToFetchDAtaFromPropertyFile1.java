package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDAtaFromPropertyFile1 {

	public static void main(String[] args) throws IOException {
		//covert physcial represtation of property file to java represtation
		FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\propertyData1.properties");
		
		//Reads the key and value from java represtation 
		Properties prop = new Properties();
		prop.load(fis);
		
		//calling the values using key
		String UrlfromPropertyFile = prop.getProperty("url");
		String UsernamefromPropertyFile = prop.getProperty("username");
		String PswrdfromPropertyFile = prop.getProperty("pswrd");
		
		
		//printing it on console
		System.out.println("The Url is :"+UrlfromPropertyFile);
		System.out.println("The Username is :"+UsernamefromPropertyFile);
		System.out.println("The pswrd is :"+PswrdfromPropertyFile);
		
	}

}
