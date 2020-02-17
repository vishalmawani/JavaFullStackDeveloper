package com.capgemini.healthcaresystem.util;

import com.capgemini.healthcaresystem.dto.DiagnosticCenter;
import com.capgemini.healthcaresystem.dto.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestRepository {
	
	static Map<String,String> centerIdCenterNameMap = new HashMap<String,String>();
	static Map<String,List<Test>> centerIdTestListMap = new TreeMap<String,List<Test>>();
	
	
		public void makeCenterIdCenterNameMap() {
			centerIdCenterNameMap.put("1001","AIMS");
			centerIdCenterNameMap.put("1002","MAX");
			centerIdCenterNameMap.put("1003","APOLO");
			centerIdCenterNameMap.put("1004","FORTIS");
			centerIdCenterNameMap.put("1005","TRAUMA CENTER");
			
		}
		
		public void makeTestList() {
			
			List<Test> listOfTests1 = new ArrayList<Test>();
			populateListOfTests(listOfTests1);
			centerIdTestListMap.put("1001",listOfTests1);
			
			List<Test> listOfTests2 = new ArrayList<Test>();
			populateListOfTests(listOfTests2);
			centerIdTestListMap.put("1002",listOfTests2);
			
			List<Test> listOfTests3 = new ArrayList<Test>();
			populateListOfTests(listOfTests3);
			centerIdTestListMap.put("1003",listOfTests3);
			
			List<Test> listOfTests4 = new ArrayList<Test>();
			populateListOfTests(listOfTests4);
			centerIdTestListMap.put("1004",listOfTests4);
			
			List<Test> listOfTests5 = new ArrayList<Test>();
			populateListOfTests(listOfTests5);
			centerIdTestListMap.put("1005",listOfTests5);
			
		
		}
		
		public List<Test> populateListOfTests(List<Test> temp){
			Test t1 = new Test(getTestId(),"blood group");
			Test t2 = new Test(getTestId(),"blood sugar");
			Test t3 = new Test(getTestId(),"blood pressure");
			temp.add(t1);
			temp.add(t2);
			temp.add(t3);
			return temp;
			
		}
		
		
		public Map<String,List<Test>> getListOfCenterIdTests(){
				return centerIdTestListMap;								// To return the list of tests.
		}
		
		public String getTestId() {
																	//Method or function to generate testId automatically...
			Test testObject = new Test();
			return testObject.generateTestId();
		}
		
		public static void main(String arg[]) {
			TestRepository object = new TestRepository();
			object.makeCenterIdCenterNameMap();
			object.makeTestList();
			System.out.println(centerIdCenterNameMap);
			System.out.println(centerIdTestListMap);
			
		}
		
			}
		
		


/*Test t8 = new Test(getTestId(),"CT-scan");
Test t9 = new Test(getTestId(),"Eye Test");
Test t10= new Test(getTestId(),"DNA test");
Test t11= new Test(getTestId(),"MRI Scan");
Test t12 = new Test(getTestId(),"Full Body Checkup");
Test t13= new Test(getTestId(),"Liver Function Test");
listOfTests.add(t8);
		listOfTests.add(t9);
		listOfTests.add(t10);
		listOfTests.add(t11);
		listOfTests.add(t12);
		listOfTests.add(t13);*/

