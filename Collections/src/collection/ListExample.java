package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

public static void main(String[] args) {

List<String> employee = new ArrayList<String>(); 
employee.add("rajeswari");
employee.add("pavani");
System.out.println("employee(query1):  "+employee);

List<String> students = new ArrayList<String>();
students.add("mounika");
students.add("kavya");
students.add("manasa");
System.out.println("students(query2):  "+students);


employee.addAll(students);
System.out.println("employee(after combination of queries):  "+employee);
}
}

