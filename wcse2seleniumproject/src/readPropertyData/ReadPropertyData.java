package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties"); //Provide the path of the file
		
		//To read the property data
		
		Properties prop = new Properties();
		
		//We need to use this methods
		
		prop.load(fis); //Make the file ready for read
		
		String data = prop.getProperty("password");
		System.out.println(data);
	}

}
