package collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	public static void main(String[] args) {
		
		List<String> student = new ArrayList<String>(); 
		student.add("rajeswari");
		student.add("pavani");
		student.add("mounika");
		student.add("kavya");
		student.add("manasa");
		student.add("aswani");
		System.out.println("student:  "+student);
		 student.addAll(student);
		 
		Set<Integer> set = new HashSet<Integer>();
	     set.add(10);
	     set.add(20);
	     set.add(30);
	     set.add(40);
	     set.add(50);
	     set.add(60);
		
	System.out.println(set);

		//map
	      Map m1 = new HashMap(); 
	      m1.put("java",1);
	      m1.put("dotnet",2);
	      m1.put("html",3);
	      m1.put("ios",4);
	      m1.put("android",5);
	      m1.put("ajax",6);

	   
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	     
	   }
	
	


	}

	
	
