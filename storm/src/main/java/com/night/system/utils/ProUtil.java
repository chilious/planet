package com.night.system.utils;

import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 该类用于读取属性文件
 * 
 * @author Chilious
 */
public class ProUtil {
	@SuppressWarnings("finally")
	public static String getException(String key) throws Exception {
		InputStreamReader is = null;
		String value = null;
		try {
			Properties p = new Properties();
			is = new InputStreamReader(ProUtil.class.getClassLoader().getResourceAsStream("error_config.properties"),
					"utf-8");
			p.load(is);
			value = p.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}finally{
			try{if(is != null) is.close();}catch(Exception e){e.printStackTrace();}
			return value;
		}
	}
}
