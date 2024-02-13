package collections;

import java.util.Set;
import java.util.HashSet;

public class SetCollection {

	public static void main(String[] args) {
		// It contains unique things only no duplicacy is allowed
		//order it lost in set
		System.out.println("Set collection started");
		//initialisation of set
		Set<String> words = Set.of("Apple","Banana","Cat");
		Set<String> hashset = new HashSet<>(words);
		hashset.add("deer");
		hashset.add("apple");
		hashset.add("Apple"); //will not be inserted
		//hashset.add(2,"Apple"); //cannot add element to specific index or deletion from specific index
		System.out.println("set elements =>"+hashset);
		
	}

}
