package com.hibernate;

import java.util.*;  
import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class FetchData2 {  
public static void main(String[] args) {  
      
    Session session=new Configuration().configure("hibernate2.cfg.xml")  
                          .buildSessionFactory().openSession();  
      
    Query query=session.createQuery("from Question2");  
    List<Question2> list=query.list();  
      
    Iterator<Question2> itr=list.iterator();  
    while(itr.hasNext()){  
        Question2 q=itr.next();  
        System.out.println("Question Name: "+q.getQname());  
          
        //printing answers  
        List<Answer2> list2=q.getAnswers();  
        Iterator<Answer2> itr2=list2.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());  
        }  
          
    }  
    session.close();  
    System.out.println("success");  
}  
}  