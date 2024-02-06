package collections;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetCollection {

	public static void main(String[] args) {
		System.out.println("Tree set collection started");
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,54,78,23,32,91));
		System.out.println("all elements in numbers=>"+numbers);
		System.out.println("lower than 40=>"+numbers.floor(40)); //lower than 40
		System.out.println("strictly lower than 40=>"+numbers.floor(40)); //strictly lower than 40
		System.out.println("greater than equal to=>"+numbers.ceiling(32)); //means >= 40
		System.out.println("greater than equal to=>"+numbers.ceiling(36)); //strictly lower than 40
		System.out.println("greater than 36=>"+numbers.higher(36)); //greather than
		System.out.println("subset range=>"+numbers.subSet(23,65)); //range between
		System.out.println("subset range with lower and upper range inclusive=>"+numbers.subSet(23,true,65,true)); //including lower and upper limit
		System.out.println("subset range =>"+numbers.subSet(23,true,65,false)); //including lower and upper limit
		System.out.println("up to element =>"+numbers.headSet(50)); //up to element 50
		System.out.println("after that element =>"+numbers.tailSet(50)); //after element 50


		
	}

}
