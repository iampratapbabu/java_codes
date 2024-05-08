package functionalprogramming;

import java.util.List;

public class FunctionalMain {
    public static void main(String[] args){
        System.out.println("hello partone");
        List<Integer> list1 = List.of(1,2,2,3,4,5,6,7,4,4,56,3,2,2,67,3,3,6,3,3,4,4);

        //looping
        list1.stream().forEach(element->System.out.println("element =>"+element));

        //printing odd numbers
        list1.stream().filter(element->element %2 ==1).forEach(element->System.out.println(element));

        //calculating sum
        int sum = list1.stream().reduce(0,(number1,number2)->number1+number2);
        System.out.println("total sum"+sum);

    }
}
