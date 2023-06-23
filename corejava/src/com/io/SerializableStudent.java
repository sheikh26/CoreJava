package com.io;

import java.io.Serializable;  

public class SerializableStudent implements Serializable{  
 
	int id;  
	String name;  
	transient int age;//Now it will not be serialized   
	
 public SerializableStudent(int id, String name, int age) {  
  this.id = id;  
  this.name = name; 
  this.age = age; 
 }  
}  