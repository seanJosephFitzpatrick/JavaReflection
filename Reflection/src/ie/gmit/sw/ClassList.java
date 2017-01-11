package ie.gmit.sw;

import java.util.LinkedList;
import java.util.List;

public class ClassList
{
	
	List<Class<?>> list = new LinkedList<Class<?>>();
	
	/**
	 * 
	 * @return true/false isEmpty
	 */
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	/**
	 * 
	 * @param e add
	 * @return e
	 */
	public boolean add(Class<?> e) 
	{
		return list.add(e);
	}

	/**
	 * 
	 * @return size
	 */
	public int size()
	{
		return list.size();
	}

	/**
	 * 
	 * @param arg0 if list contains item
	 * @return item
	 */
	public boolean contains(Object arg0) {

		return list.contains(arg0);
	}

	/**
	 * 
	 * @param index get index
	 * @return index item
	 */
	public Class<?> get(int index)
	{
		return list.get(index);
	}

	
}
