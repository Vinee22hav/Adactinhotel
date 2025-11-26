package WeeklyTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_java {

	public static void main(String[] args) {
		//List
		 List<String> list = new ArrayList();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        list.add("Banana");  // Allows duplicates
	        
	        System.out.println("List elements: " + list);

	        list.remove("Banana");
	        System.out.println("After removal: " + list);

	        System.out.println("Element at index 1: " + list.get(1));
	        
	        
	        //Set
	        Set<String> set = new HashSet();
	        set.add("Red");
	        set.add("Green");
	        set.add("Blue");
	        set.add("Red"); // Duplicate ignored
	        
	        System.out.println("Set elements: " + set);
	        
	        //Map
	        Map<Integer, String> map = new HashMap<Integer, String>();
	        map.put(101, "John");
	        map.put(102, "Emma");
	        map.put(103, "Alex");
	        
	        System.out.println("Map elements: " + map);
	        
	        System.out.println("Value of key 102: " + map.get(102));
	        
	        map.remove(103);
	        System.out.println("After removal: " + map);
		
	}

}
/*
 * List
 * set
 * map
 * queue
 * 
 * 
 * **/


