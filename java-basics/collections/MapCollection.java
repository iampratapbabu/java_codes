package collections;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("map collection program started");
		Map<String,Integer> myMap = Map.of("A",3,"k",8,"Z",9);
		System.out.println("get value of key=>"+myMap.get("A"));
		System.out.println("size of map=>"+myMap.size());
		System.out.println("checking if map is empty=>"+myMap.isEmpty());
		System.out.println("checking key in map=>"+myMap.containsKey("A"));
		System.out.println("checking key in map=>"+myMap.containsKey("P"));
		System.out.println("checking value in map=>"+myMap.containsValue(9));
		System.out.println("getting keys of map=>"+myMap.keySet());
		System.out.println("getting values of map=>"+myMap.values());
		System.out.println("all elements of map=>"+myMap);
		
		
		Map<String,Integer> myHashMap = new HashMap<>(myMap);
		System.out.println("setting value in hashmap=>"+myHashMap.put("P",11)); //returns null means P was not present before
		System.out.println("setting value in hashmap=>"+myHashMap.put("P",13)); //returns previous value of P and replaces it with new value of P
		System.out.println("all elements of hashmap=>"+myHashMap);

		
		Map<String,Integer> myLinkedHashMap = new LinkedHashMap<>(); //it follows the order in which element are inserted
		myLinkedHashMap.put("F", 45);
		myLinkedHashMap.put("B", 35);
		myLinkedHashMap.put("K", 25);
		System.out.println("all elements of linked hash map=>"+myLinkedHashMap);

		
		TreeMap<String,Integer> myTreeMap = new TreeMap<>(); //it stpres the element in sorted order of keys
		myTreeMap.put("F", 45);
		myTreeMap.put("B", 35);
		myTreeMap.put("K", 25);
		myTreeMap.put("A", 25);
		myTreeMap.put("M", 250);
		System.out.println("get higher key =>"+myTreeMap.higherKey("B")); //b se upar ka key
		System.out.println("get lower key =>"+myTreeMap.lowerKey("B")); //b se lower key that is less than b
		System.out.println("get floor key =>"+myTreeMap.floorKey("B"));// less than equal to b
		System.out.println("get ceiling key =>"+myTreeMap.ceilingKey("B")); //>= key passed
		System.out.println("fist key value =>"+myTreeMap.firstEntry()); 
		System.out.println("last key value=>"+myTreeMap.lastEntry()); 
		System.out.println("sub map between range=>"+myTreeMap.subMap("C","M"));
		System.out.println("sub map between range including the range=>"+myTreeMap.subMap("C",true,"M",true)); //
		System.out.println("sub map between range including the range=>"+myTreeMap.subMap("A",true,"M",true)); //



		System.out.println("all elements of Tree map=>"+myTreeMap);

		

	}

}
