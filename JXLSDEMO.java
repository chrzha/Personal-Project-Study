package com.chrzha.test;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

public class JXLSDemo {
	
    public static final String LOCAL_TEMPLATE_FOLDER = "/template/";
    public static final String LOCAL_OUTPUT_FOLDER = "/output/";
    
    public static final String F_TEMPLATE_WEBCONTENT = "webcontent_template.xls";

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws ParsePropertyException 
	 */
	public static void main(String[] args) throws ParsePropertyException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		String canoicalPath = new File(".").getCanonicalPath().replace("\\", "/");
		String templateFileName =  canoicalPath + LOCAL_TEMPLATE_FOLDER + F_TEMPLATE_WEBCONTENT;
        String destFileName = canoicalPath + LOCAL_OUTPUT_FOLDER + "JXLSDEMO_OUT.xls";
		Map<String, List<User>> beans = new HashMap<String, List<User>>();
		List<User> users = new ArrayList<User>();
		users.add(new User("abc", "123"));
		users.add(new User("def", "456"));
		users.add(new User("ghi", "789"));
        beans.put("user", users);
        
        XLSTransformer transformer = new XLSTransformer();
        transformer.transformXLS(templateFileName, beans, destFileName);
	}

}
