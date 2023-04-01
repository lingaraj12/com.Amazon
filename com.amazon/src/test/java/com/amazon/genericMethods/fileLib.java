package com.amazon.genericMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileLib {
public String getDataFomProperties(String path,String key) throws IOException {
	FileInputStream ip=new FileInputStream(path);
	Properties pr=new Properties();
	pr.load(ip);
String data=pr.getProperty(key);
return data;

}


}
	
	
	
	
	

