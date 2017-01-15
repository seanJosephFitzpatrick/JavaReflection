package ie.gmit.sw.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author Sean Fitzpatrick
 */
public class JarLoader {
	
	List<Class> classList = new ArrayList<Class>();
		
	/**
	 * @param jarName Holds jar file location 
	 * @return classList Returns the class list
	 * @throws IOException Throws input/output exception
	 */
	
	public List<Class> getJarContents(String jarName) throws IOException{
		
		URL[] url = { new URL("jar:file:" + jarName +"!/") };
		URLClassLoader ucl = URLClassLoader.newInstance(url);
		
		//Create JarInputStream for jar file
		JarInputStream in = new JarInputStream(new FileInputStream(jarName));
		JarEntry next = in.getNextJarEntry();//Assign JarEntry to next
		
		//while next is not null
		while (next != null) {
			if (next.getName().endsWith(".class")) {
				String name = next.getName().replaceAll("/", "\\.");
				name = name.replaceAll(".class", "");
				if (!name.contains("$")) name.substring(0, name.length() - ".class".length());
				
				Class cls;
				try {
					cls = Class.forName(name, false, ucl);
					classList.add(cls);
				} 
				catch (ClassNotFoundException e) {
					System.out.println("Couldn't find class : " + name);
					System.out.println("Exception : " + e);
					System.exit(0);
				}
			}
			next = in.getNextJarEntry();
		}
		return classList;	
	}
	
}
