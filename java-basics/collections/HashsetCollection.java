package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetCollection {

	public static void main(String[] args) {
		System.out.println("Hashset collection program started");
		
		Set<Integer> numbers = new HashSet<>(); //Here Set is implemented by Hashset we can use LinkedHashSet or whatever
											// all method of set is inherited because we Initialised numbers by Set
		numbers.add(2);
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		System.out.println("all elements inside numbers set=>"+numbers); //orders are not following up
		
		Set<Integer> numbers2 = new LinkedHashSet<>(); //here we are implementing Set using Linkedhash set 
														//data structure only define in which way it will store the element
		// we can use different data structure according to our need for deletion linkedlist is good but for accessing element
		//arraylist is good according to our need we can choose which data structure will be best for us 
		numbers2.add(5);
		numbers2.add(2);
		numbers2.add(3);
		numbers2.add(2);
		numbers2.add(9);
		System.out.println("all elements inside numbers set=>"+numbers2); //orders are  following up
		
		Set<Integer> numbers3 = new TreeSet<>(); //in tree set it will store element in sorted order
												//it will also sort if we store character in treeset
		numbers3.add(5);
		numbers3.add(2);
		numbers3.add(3);
		numbers3.add(2);
		numbers3.add(9);
		System.out.println("all elements inside numbers set=>"+numbers3); //orders are  following up
		
	}

}
