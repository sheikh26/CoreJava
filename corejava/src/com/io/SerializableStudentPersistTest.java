package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableStudentPersistTest {
	
	public static void main(String args[]){  
		try{    
			  //Creating the object    
			  SerializableStudent s1 =new SerializableStudent(211,"ravi",5);    
			  //Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("D:/IOFilesFolder/newtest.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("success");    
			  }catch(Exception e){
				  System.out.println(e);
				  }    
			 }        
}

