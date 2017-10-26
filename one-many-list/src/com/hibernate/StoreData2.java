package com.hibernate;

import java.util.ArrayList;  
import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class StoreData2 {  
public static void main(String[] args) {  
    Session session=new Configuration().configure("hibernate2.cfg.xml")  
                            .buildSessionFactory().openSession();  
    Transaction t=session.beginTransaction();  
      
    Answer2 ans1=new Answer2();  
    ans1.setAnswername("java is a programming language");  
    ans1.setPostedBy("mounika");  
      
    Answer2 ans2=new Answer2();  
    ans2.setAnswername("java is a platform");  
    ans2.setPostedBy("atchyuth");  
      
    Answer2 ans3=new Answer2();  
    ans3.setAnswername("Servlet is an Interface");  
    ans3.setPostedBy("sai Kumar");  
      
    Answer2 ans4=new Answer2();  
    ans4.setAnswername("Servlet is an API");  
    ans4.setPostedBy("raji");  
      
    ArrayList<Answer2> list1=new ArrayList<Answer2>();  
    list1.add(ans1);  
    list1.add(ans2);  
      
    ArrayList<Answer2> list2=new ArrayList<Answer2>();  
    list2.add(ans3);  
    list2.add(ans4);  
      
    Question2 question1=new Question2();  
    question1.setQname("What is Java?");  
    question1.setAnswers(list1);  
      
    Question2 question2=new Question2();  
    question2.setQname("What is Servlet?");  
    question2.setAnswers(list2);  
      
    session.persist(question1);  
    session.persist(question2);  
      
    t.commit();  
    session.close();  
    System.out.println("success");  
}  
}  