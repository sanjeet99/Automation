package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) 
	
	{    //Array List
		/*
		 * List<String> list=new ArrayList<>(); list.add("Tani"); list.add("Saini");
		 * list.add("Learning Java");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
		//LinkedList
		/*
		 * List<String> list=new LinkedList<>(); list.add("Tani"); list.add("Saini");
		 * list.add("Learning Java");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
		//Vector // only changed the object i.eVector/LL/ArrayList and reference is same i.e List which is kind of parent
		List<String> list=new Vector<>(); //Changed only class name
		list.add("Tani");
		list.add("Saini");
		list.add("Learning Java");
		list.add("Tani");
		list.add("Saini");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		

	}

}
