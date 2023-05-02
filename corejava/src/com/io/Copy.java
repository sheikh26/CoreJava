package com.io;

import java.io.*;

public class Copy {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String sourceFile = "E:/ns/workspace/SampleAcn.jar";
		String targetFile = "E:/ns/workspace/new.jar";
		
		FileInputStream in = new FileInputStream(sourceFile);
		FileOutputStream out = new FileOutputStream(targetFile);
		
		int c ;
		
		while ((c=in.read())!= -1){
			out.write(c);
		}

		out.close();
		in.close();
		
	}

}
