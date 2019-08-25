package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args)

	{

		// Random Hashset
		/*
		 * Set<Integer> set=new HashSet<>(); set.add(10); set.add(20); set.add(30);
		 * set.add(40);
		 * 
		 * set.add(30); set.add(40); // Set will not allow duplicate values only unique
		 * 
		 * 
		 * for(int a:set) { System.out.println(a); }
		 */

		//LinkedHashSet
		/*
		 * Set<Integer> set = new LinkedHashSet<>(); set.add(10); set.add(20);
		 * set.add(30); set.add(40); set.add(30); set.add(40); for(int a:set) {
		 * System.out.println(a); }
		 */
		
		//TreeSet - Sorted
		Set<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(20);
		/*
		 * for(int a:set) { System.out.println(a); }
		 */	
		Iterator<Integer> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		}

}
