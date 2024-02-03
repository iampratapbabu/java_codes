package collections;

import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Bat","Cat");
		//list is immutable that is we cannot add more items to list or assign other item inplace of pervious one
		System.out.println("size of list =>"+words.size());
		System.out.println("checking list is empty =>"+words.isEmpty());

		System.out.println("full list printint =>"+words);
		System.out.println("accessing a single element =>"+words.get(1));
		System.out.println("getting index of element =>"+words.indexOf("Cat")); //if not present will return -1

		
		System.out.println("checking a single element is present =>"+words.contains("Cat"));

		

		
		
		

	}

}
