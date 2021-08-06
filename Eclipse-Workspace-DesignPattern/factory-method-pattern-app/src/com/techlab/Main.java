package com.techlab;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		FileReader reader;
		Properties p=new Properties();
		
		reader = new FileReader("info.properties");
		p.load(reader);
		//p.load(ClassLoader.getSystemResourceAsStream("info.properties"));
		String className = p.getProperty("currentfactory");  
		Class cls = Class.forName(className);
		Method staticmethod = cls.getMethod("getInstance", null);
		
		System.out.println("Factory Name: "+ cls.getSimpleName());
		IAutoFactory factory = (IAutoFactory) staticmethod.invoke(staticmethod);
		System.out.println("HashCode "+factory.hashCode());
		
		
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
		auto.getName();
		
		IAutoFactory anotherfactory = (IAutoFactory) staticmethod.invoke(staticmethod);
		System.out.println("HashCode "+anotherfactory.hashCode());
		
//		IAutoFactory factory1 = (IAutoFactory) cls.newInstance();
//		System.out.println("HashCode "+factory1.hashCode());
//		IAutoFactory factory2 = (IAutoFactory) cls.newInstance();
//		System.out.println("HashCode "+factory2.hashCode());
		
	
		
//		
//		// TODO Auto-generated method stub
//		IAutoFactory factory = TESLAFactory.getInstance();
//		System.out.println("HashCode "+factory.hashCode());
//		IAuto auto = factory.make();
//		auto.start();
//		auto.stop();
//		auto.getName();
//		
//		
//		IAutoFactory anotherfactory = TESLAFactory.getInstance();
//		System.out.println("HashCode "+anotherfactory.hashCode());
	}

}
