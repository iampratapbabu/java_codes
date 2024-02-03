
import java.util.Arrays;
import java.util.ArrayList;

public class ArraysAndArrayList {
	
	static void sum(int... values) {
		//here argument come as an array like if you pass sum(1,2,3) it will accessed as [1,2,3]
		System.out.println("printing array through arguments=>"+Arrays.toString(values));
		int totalSum = 0;
		for(int value:values) {
			totalSum+=value;
		}
		System.out.println("total sum "+totalSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {25,54,34};
		//System.out.println(marks[0]);
		int sum=0;
		for(int mark:marks) {
			sum=sum+mark;
		}
		System.out.println("total marks =>"+sum);
		
		int[] marks2 = new int[5]; //array of 5 int size will be created and 0 se intialized ho jayega	
		System.out.println("marks2=>"+marks2[2]);
		
		System.out.println("marks array address =>" +marks); //we will get the memory location
		//to print the whole array using sysout
		System.out.println("marks array =>"+Arrays.toString(marks));
		
		boolean[] boolArray = new boolean[5];
		double[] doubleArray = new double[5];
		
		class Person{}
		Person[] personArray = new Person[5]; //array of class
		personArray[0] = new Person();
		for(Person person:personArray) {
			System.out.println("single person =>"+person);
		}
		
		//create an array with prefilled a value
		int[] prefillArray = new int[5];
		Arrays.fill(prefillArray,25);
		System.out.println("prefilled array=>"+Arrays.toString(prefillArray));
		
		// to compare two arrays
		System.out.println("comparing two array=>"+Arrays.equals(prefillArray, marks));
		
		//sorting an array
		Arrays.sort(marks);
		System.out.println("sorted array of marks =>"+Arrays.toString(marks));
		
		//variable arguments
		sum(2,3,4); //printing through sum function where we are taking many inputs
		
		String[] textValues = {"apple","ball","cat","deer","elephant"};
		System.out.println("text values =>"+Arrays.toString(textValues));
		
		//ArrayList 
		ArrayList myArrayList = new ArrayList(); //we have not defined any type so we can add any value int,string etc
		myArrayList.add("ant");
		myArrayList.add("books");
		myArrayList.add("cake");
		myArrayList.add(2);
		myArrayList.remove(1);
		System.out.println("my array list print=>"+myArrayList);

		
		ArrayList<String> myStringArrayList = new ArrayList<String>();
		myStringArrayList.add("ant");
		myStringArrayList.add("books");
		myStringArrayList.add("cake");
		myArrayList.remove(2);
		//myStringArrayList.add(2);  //here int can be added because arraylist is defined for string
		System.out.println("my string array list print=>"+myStringArrayList);

	}

}
