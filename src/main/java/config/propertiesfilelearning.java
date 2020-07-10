package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesfilelearning {
	static Properties pro = new Properties();
	public static void main(String[] args) {
		Readpropert();
		Writeonfile();
		
		
	}
	
	public static void Readpropert() {
		
		try {
			
			InputStream inpt = new FileInputStream("C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\src\\main\\java\\config\\confg.properties");
			pro.load(inpt);
			pro.getProperty("browser");
			System.out.println(pro.getProperty("browser"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
public static void Writeonfile() {
	try {
		OutputStream output = new FileOutputStream("C:\\\\Users\\\\budap\\\\eclipse-workspace\\\\Spring2020selenium\\\\objecttec\\\\src\\\\main\\\\java\\\\config\\\\confg.properties");
		System.out.println(pro.setProperty("my wife", "Nabarang"));
		pro.store(output, "love");
	} catch (Exception e) {
		
		
		e.printStackTrace();
	}
	 
	
}
}
