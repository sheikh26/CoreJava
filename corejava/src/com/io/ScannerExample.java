package com.io;

import java.util.*;  

public class ScannerExample {  

	public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.print("Enter your MOb No: ");  
          String mob = in.nextLine(); 
          System.out.println("Name is: " + name);      
          System.out.println("MOb is: " + mob);
          in.close();             
          }  
}  