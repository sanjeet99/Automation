package collections;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface { //Used to store Key values

	public static void main(String[] args) 
	
	{
		//Hashmap *null value is allowed
		
		/*
		 * Map<String, Integer> map= new HashMap<String, Integer>(); map.put("Tani",
		 * 22); map.put("abhishek", 27); map.put("ayushi", 24); map.put(null, 50);
		 * 
		 * System.out.println(map.get(null));
		 */
		 
		
		//HashTable is synchronized as null value is not allowed
		
		  Map<String, Integer> map= new Hashtable<String, Integer>(); 
		  map.put("Tani",22); map.put("abhishek", 27); map.put("ayushi", 24);// map.put(null, 50);
		  map.put("abhishek", 28);
		  
		  System.out.println(map.get("abhishek"));
		  
		  Set<String> set=map.keySet();
		  for(String s:set)
		  {
			  System.out.println(map.get(s));
		  }
		  
		 
	

	}

}
