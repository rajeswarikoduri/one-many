package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listtoset
{
    public static void main(String[] args)
    {
        List<String> studentList = new ArrayList<String>();
        studentList.add("rajeswri");
        studentList.add("pavani");
        studentList.add("mounika");
        studentList.add("kavya");
        studentList.add("manasa");
        studentList.add("manasa");
        studentList.add("manasa");
        studentList.add("manasa");
        System.out.println("List names.....");
        for (String student :  studentList)
        {
            System.out.println(student);
        }
        Set<String> alphaSet  = new HashSet<String>( studentList);
        System.out.println("\tSet names .....");
        for (String alpha : alphaSet)
        {
            System.out.println(alpha);
            
        }
    }
}

