package collection;
import java.util.*;

public class Listtomap {
	
	
	public  static  void main(String[] args) {
	    List<String> names = Arrays.asList("rajeswari,mounika,pavani,kavya".split(","));
	    List<String> things = Arrays.asList("10,20,30,40,".split(","));
	    
	    Map<String,String> map = new LinkedHashMap<String,String>();  // ordered

	    for (int i=0; i<names.size(); i++) {
	      map.put(names.get(i), things.get(i));    // is there a clearer way?
	    }

	    System.out.println(map);
	  }
	}

