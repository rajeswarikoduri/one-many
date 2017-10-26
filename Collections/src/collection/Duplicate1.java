package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class Duplicate1 {

 public static void main(String[] args) {
     
  
  int arr[] ={2,3,2,4,5,4,6,5,8,9,5};
  
  for(int i=0; i<arr.length;i++){
   System.out.println(arr[i]);
   
  }
  
  
  List li = new ArrayList();  
  li.add(2);
  li.add(4);
  li.add(5);
  Iterator it= li.listIterator();
  
  System.out.println("List Values"+li);
 HashSet set= new HashSet(li);
  System.out.print("Set values---------"+set);
  
  while(it.hasNext()){
   
   Object i= it.next();
   if(set.add(i)){
    System.out.println("NotDuplcates"+i.toString());
    }else{
     
     System.out.println("Duplcates"+i.toString());
     
    }
   
      
   
  }
  

 }

}