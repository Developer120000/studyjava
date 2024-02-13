package com.ict.study;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class a_dbservice {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/study/a_config.xml";
	
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}
