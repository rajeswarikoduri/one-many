package com.hibernate;

import java.util.List;  

public class Question2 {  
private int id;  
private String qname;  
private List<Answer2> answers;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public List<Answer2> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer2> answers) {
	this.answers = answers;
}  
}