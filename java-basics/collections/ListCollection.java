package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) {
		
		//anything we create using .of operator is immutable here these lists are immutable
		List<String> words = List.of("Apple","Bat","Cat");
		List<String> animals = List.of("zebra","lion","horse");
		List<Integer> numbers = List.of(989,34,54,67,34,33,2,4);
		
		//iterating in arraylist
		for(int i = 0;i<words.size();i++) {
			System.out.println("Words list iteration =>"+words.get(i));
		}
		
		//second method => good for reading of element
		for(String singleWord:words) {
			System.out.println(singleWord);
		}
		
		//using iterator => good for deletion of element
		Iterator<String> wordsIterator = words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.println("Iteration using iterator => "+wordsIterator.next());
		}
		
		while(wordsIterator.hasNext()) {
			if(wordsIterator.next().endsWith("at")) {
				wordsIterator.remove();
			}
		}
		
		//sorting
		List<Integer> numbersAl = new ArrayList<>(numbers);
		Collections.sort(numbersAl);
		System.out.println("numbers array after sorting=>"+numbersAl);
		

		//list is immutable that is we cannot add more items to list or assign other item inplace of pervious one
		System.out.println("size of list =>"+words.size());
		System.out.println("checking list is empty =>"+words.isEmpty());

		System.out.println("full list printint =>"+words);
		System.out.println("accessing a single element =>"+words.get(1));
		System.out.println("getting index of element =>"+words.indexOf("Cat")); //if not present will return -1

		
		System.out.println("checking a single element is present =>"+words.contains("Cat"));
		
		//we can create list by ArrayList LinkedList and Vector
		List<String> wordsArrayList = new ArrayList<String>(words);
		wordsArrayList.add("doggy"); //now we can add new elements
		wordsArrayList.add("doggy"); // arraylist can have duplicates
		wordsArrayList.add(2,"elephant"); //adding at particular index
		wordsArrayList.set(2,"puppy"); //modifying element in arraylist
		wordsArrayList.remove(3); //removing element from arraylist using indes
		wordsArrayList.remove("Apple"); //removing elements by element name
		wordsArrayList.addAll(animals); //merging two arraylists
			
		System.out.println("full list of arraylist print =>"+wordsArrayList);
		

		
		List<String> wordsLinkedList = new LinkedList<String>(words);

		List<String> wordsVector = new Vector<String>(words); //vector is thread safe



		
		
		

	}

}
