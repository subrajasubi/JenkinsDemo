package com.leaftaps.testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ExecutableJarFile {

	public static void main(String[] args) {
	
		XmlSuite suite = new XmlSuite();
		suite.setName("MavenSuite");

		XmlTest test = new XmlTest(suite);
		test.setName("MavenTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.leaftaps.testcases.TC001_VerifyLogin"));
		test.setXmlClasses(classes) ;
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
		
		
		
		
	}

}
