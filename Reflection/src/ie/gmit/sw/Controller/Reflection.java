package ie.gmit.sw.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ie.gmit.sw.Model.JarLoader;

public class Reflection implements Mappable, Measurable {
	
	private Map<String, Stability> map = new HashMap<String, Stability>();
	private List<Class> classList;
	private String name;
	private JarLoader jl = new JarLoader();
	
	
	/**
	 * @param jarName Holds jar file location
	 * @throws FileNotFoundException Throws a file not found exception
	 * @throws IOException Throws input/output exception
	 */
	public Reflection(String jarName) throws FileNotFoundException, IOException{
		this.name = jarName;
		this.classList = jl.getJarContents(name);
		addToMap();
		calculateStability();
	}
   
	/**
	 *reflection Use Reflection to get Interfaces, Constructors, Fields, Methods and params from classes
	 * @param cls Class
	 */
	public void reflection(Class cls){
		// A list to track each referenced class to avoid duplicates
		List<String> classList = new ArrayList<String>();
		int outdegree = 0;

		Class[] interfaces = cls.getInterfaces(); // Get the set of Interfaces
		for(Class inter : interfaces){
			if(map.containsKey(inter.getName())) {
				if(!classList.contains(inter.getName())){
					classList.add(inter.getName());
					outdegree++;
					Stability stability = map.get(inter.getName());
					stability.setInDegree(stability.getInDegree() + 1);
				}
			}
		}

		/**
		 * Constructor Get class constructors
		 */
		Constructor[] constructor = cls.getConstructors(); 
		Class[] constructorParams;
		for(Constructor c : constructor){
			constructorParams = c.getParameterTypes();
			for(Class cp : constructorParams){
				if(map.containsKey(cp.getName())){
					if(!classList.contains(cp.getName())){
						classList.add(cp.getName());
						outdegree++;
						Stability stability = map.get(cp.getName());
						stability.setInDegree(stability.getInDegree() + 1);
					}
				}
			}
		}

		/**
		 * Field Get class fields
		 */
		Field[] fields = cls.getDeclaredFields(); // Get the set of Fields
		for(Field field : fields){
			Type type = field.getType();
			if(map.containsKey(type.getTypeName())){
				if(!classList.contains(type.getTypeName())){
					classList.add(type.getTypeName());
					outdegree++;
					Stability stability = map.get(type.getTypeName());
					stability.setInDegree(stability.getInDegree() + 1);
				}
			}
		}

		/**
		 * Methods Get class methods
		 */
		Method[] methods = cls.getDeclaredMethods();
		Class[] methodParams;

		for(Method m : methods){
			Class methodReturnType = m.getReturnType();
			if(map.containsKey(methodReturnType.getName())){
				if(!classList.contains(methodReturnType.getName())){
					classList.add(methodReturnType.getName());
					outdegree++;
					Stability stability = map.get(methodReturnType.getName());
					stability.setInDegree(stability.getInDegree() + 1);
				}
			}

			/**
			 *methodParams Get method parameters
			 */
			methodParams = m.getParameterTypes();
			for(Class mp : methodParams){
				if(map.containsKey(mp.getName())){
					if(!classList.contains(mp.getName())){
						classList.add(mp.getName());
						outdegree++;
						Stability stability = map.get(mp.getName());
						stability.setInDegree(stability.getInDegree() + 1);
					}
				}
			} 
		}
		
		System.out.println();
		System.out.println("Class: " + cls.getName());
		
		map.get(cls.getName()).setOutDegree(outdegree);
		System.out.println("Afferent Coupling (indegree) : " + map.get(cls.getName()).getInDegree());		
		System.out.println("Efferent Coupling (outdegree) : " + map.get(cls.getName()).getOutDegree());		
		System.out.println("Stability Metric : " + map.get(cls.getName()).getStability());
	}
	
	public Object[][] getData(){

		int i = 0;
		Object[][] data = new Object[map.size()][4];

		// For each metric object in the map
		for(Stability stability : map.values()){
			// Add the data to the array
			data[i][0] = stability.getClassName();  // set class name
			data[i][1] = stability.getInDegree();  // set inDegree
			data[i][2] = stability.getOutDegree();  // set outDegree
			data[i][3] = stability.getStability();  // set stability

			i++;
		}

		return data;
	}

	/**
	 *calculaeStability Calculate Stability method
	 */
	public void calculateStability() {
		// TODO Auto-generated method stub
		try {
			
			URL[] url = { new URL("jar:file:" + name +"!/") };
			URLClassLoader ucl = URLClassLoader.newInstance(url);

			// For every key in the graph map
			for (String className : map.keySet()) {
				// Load the Class
				Class cls = Class.forName(className, false, ucl);

				// Use Java Reflection to calculate the in and out degree
				reflection(cls);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}

	/**
	 *addToMap Add classes to Map
	 */
	public void addToMap() {
		// TODO Auto-generated method stub
		//Add classes to Map
		System.out.println("Classes : ");
		for(int i = 0; i < classList.size(); i++)
		{
			map.put(classList.get(i).getName(), new Stability());
			map.get(classList.get(i).getName()).setClassName(classList.get(i).getName());
			System.out.println(classList.get(i).getName());
		}
		System.out.println("\nAmount of classes stored in Map : " + map.size());
		
	}
}
