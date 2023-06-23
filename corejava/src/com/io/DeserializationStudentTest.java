package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationStudentTest {
	
	public static void main(String args[]){  
		  try{  
		  //Creating stream to read the object  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/IOFilesFolder/newtest.txt"));  
		  SerializableStudent s=(SerializableStudent)in.readObject();  
		  //printing the data of the serialized object  
		  System.out.println(s.id+" "+s.name+"age"+s.age);  
		  //closing the stream  
		  in.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
}
