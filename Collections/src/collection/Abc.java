package collection;

import java.util.ArrayList;
import java.util.List;

 class Abc {

public static void main(String[] args) {

List<Integer> numbers = new ArrayList<Integer>(); 
numbers.add(1);
numbers.add(2);
numbers.add(2);
numbers.add(2);
System.out.println(numbers.get(0));
System.out.println(numbers.get(1));
System.out.println(numbers);

List<Integer> num = new ArrayList<Integer>();
num.add(3);
num.add(4);
num.add(2); 
num.add(2);
System.out.println(num.get(0));
System.out.println(num.get(1));
System.out.println(num);

System.out.println("/nIteration: ");
		
 for (int i=0; i<numbers.size(); i++){
	 System.out.println(numbers.get(i)); 
 }
 for (int j=0; j<num.size(); j++){
	 System.out.println(num.get(j)); 
 }
}
}