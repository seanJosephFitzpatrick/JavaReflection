package ie.gmit.sw;

import java.io.*;
import java.util.*;

public class Runner {
	
	public static void main(String[] args) throws IOException {
		
		Loader load = new Loader();//Create instance of Loader
		
		/*
		 * Call getJarContents method and pass it location of .jar
		 */
		List<?> myList = load.getJarContents("C:/Users/Sean Fitzpatrick/Downloads/ie/gmit/sw/string-service.jar");

		//Print out List
		System.out.println(myList);
					
	}
}
