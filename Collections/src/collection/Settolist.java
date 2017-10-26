package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Settolist {


  public static void main(String[] args) {
    List<String> student = new ArrayList<String>();
    student.add("rajeswari");
	student.add("pavani");
	student.add("mounika");
	student.add("kavya");
	student.add("manasa");
	student.add("aswani");
	student.add("aswani");
    Set<String> set = new HashSet<String>(student);
    System.out.println(set);
  //  student = new ArrayList<String>(set);
    System.out.println(student.toString());
  }
}


