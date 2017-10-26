package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class iteratorexample {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("roja");
		list.add("swathi");
		list.add("revathi");
		
		 Iterator<String> itr=list.iterator();  
		
		 while (itr.hasNext());
		 {
		 String name=itr.next();
		 System.out.println(name);
		 
		 
		
		 }	
		
	}

}
