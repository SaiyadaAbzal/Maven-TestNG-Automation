package Salesforce.Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class CommonUtilities {

	public String getproperty(String key) throws IOException
	{
		String path = "C:\\Users\\saiya\\eclipse-workspace\\TestNG\\Properties\\application.properties";
		FileInputStream fileinput = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fileinput);
		String value = prop.getProperty(key);
		return value;
		
	}
}
