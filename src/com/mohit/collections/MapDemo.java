package com.mohit.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/*
 * Map has O(1) generally for Map.get(key);
 * worst case when all keys have same hashcode, its O(n);
 */
public class MapDemo {

	public static void main(String args[]){

		List<String> list1 = new ArrayList<String>();
		list1.add("l1 -string 1");list1.add("l1 -string 2");list1.add("l1 -string 3");
		List<String> list2 = new ArrayList<String>();
		list2.add("l2 -string 1");list2.add("l2 -string 2");list2.add("l2 -string 3");
		List<String> list3 = new ArrayList<String>();
		list3.add("l3 -string 1");list3.add("l3 -string 2");list3.add("l3 -string 3");
        /*
         * Hashtable does not guarantee order of insertion , has concurrency overheads
         *   does not allow nulls  , is synchronized , no nulls
         * HashMap is not synchronized , doesnt preserve order of insertion , 
         * allows one null as key
         * LinkedHashMap is like HashMap , preserves order of insertion
         * TreeMap - doesnt maintain order of insertion - is sorted via natural order of keys
         */
		
		/*
		 * Check MultiMap of google collections , allows to have multiple values
		 */
		Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();
		map.put(1, list1);
		map.put(2, list2);
		map.put(3, list3);
		//if we put duplicate key in map , it will replace old keys value with new value

		//iterating Map 1 using keySet() returns a Set<MyGenericType> keySet = map.keySet();
		System.out.println("iterating map via keyset");
		for(int key : map.keySet()){
			System.out.println("key is "+key+" Value is : "+map.get(key));
			
		}
        
		//iterating over values
		System.out.println("iterating over values");
		
		for (List<String> value : map.values()) {
			System.out.println("Value = " + value);
			}
		
		//iterating over entrySet
		System.out.println("iterating via entryset");
		for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		//iterating using iterator
		
		Iterator<Map.Entry<Integer, List<String>>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<Integer, List<String>> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		}

	    if (map.containsKey(1))System.out.println("contains key 1");
        if (map.containsValue(list1))System.out.println("contains value list1");
        //creating a list of values
        List<List<String>> valuesToMatch  = new ArrayList<List<String>>( map.values());
        
        
        ///Sorting map based on values
        //Since the values are not unique, I find myself converting the keySet 
        //into an array, and sorting that array through array sort with a 
        //custom comparator that sorts on the value associated with the key. 
        //Is there an easier way?
        
        HashMap<String,Double> map1 = new HashMap<String,Double>();
        ValueComparator bvc =  new ValueComparator(map1);
        TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);

        map1.put("A",99.5);
        map1.put("B",61.4);
        map1.put("C",67.4);
        map1.put("D",67.3);

        System.out.println("unsorted map: "+map1);

        sorted_map.putAll(map1);

        System.out.println("results: "+sorted_map);
    }

}

class ValueComparator implements Comparator<String> {

    Map<String, Double> base;
    public ValueComparator(Map<String, Double> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}