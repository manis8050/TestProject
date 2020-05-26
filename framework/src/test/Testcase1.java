package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testcase1 {
	
	public static void main(String[] args) throws IOException {
		
	
	Properties prop=new Properties();  //Creating an object of the Properties class
	
	//To read a file, we call the class - FileInputStream and it accepts the contructor which is path of the property file
	//FileInputStream fis=new FileInputStream("C:\\Users\\manis\\workspaces\\new_IDE_workspace\\framework\\src\\config\\object.properties"
	                                      // or
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\config\\object.properties");
	
	//IF you define this way, if the code is shared with someone or migrating the code to somewhere then the path need not have to be changed.
	
	
	prop.load(fis);
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("loginid"));
	System.out.println("user.dir");  //This will give the current path/location of your project
	
	//C:\Users\manis\workspaces\new_IDE_workspace\framework\src\config\object.properties
	
	}
	

}
