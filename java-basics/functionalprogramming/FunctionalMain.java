package functionalprogramming;

import java.util.*;
import java.util.stream.IntStream;
import  java.util.stream.Collectors;



public class FunctionalMain
{
    public static void main(String[] args) {
        List<String> mylist = List.of("Apple","Bat","Cat","Dog");
        List<Integer> numlist = List.of(13,34,2,65,23,35,2);
        //normalPrint(mylist);
        //printWithFP(mylist);

        //normalFilter(mylist);
        //normalFilterFP(mylist);

        //sumOfNum(numlist);
        //sumOfNumFP(numlist);

        //numOtherMethodsFP(numlist);
        streamTerminalOperations(numlist);


    }

    private static void normalPrint(List<String> list){
        for(String string:list){
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list){
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }

    private static void normalFilter(List<String> list){
        for(String string:list){
            if(string.endsWith("at")){
                System.out.println(string);
            }
        }
    }

    private static void normalFilterFP(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element)
                );
    }

    private static void sumOfNum(List<Integer> list){
        int sum = 0;
        for(int num:list){
            sum+= num;
        }
        System.out.println(sum);
    }

    private static void sumOfNumFP(List<Integer> list){
        int sum = 0;
        //sum = list.stream().reduce(0,(n1,n2)->n1 + n2); //n1,n2 ->n1+n2 is a lambda expression
        //put concentration here now
        // currently we have written only one line but we can extend it to multiple line using curly braces
        // but we have to use a return statement (same we do in react )
        sum = list.stream().reduce(0,(n1,n2)->{
            System.out.println(n1+","+n2);
            return n1 + n2;

        });
        System.out.println(sum);
    }

    private static void numOtherMethodsFP(List<Integer> list){
        //sorting
        list.stream()
                .sorted()
                .forEach(element -> System.out.println(element));

        System.out.println("----------------------------------------");

        //distinct
        list.stream()
                .distinct()
                .forEach(element -> System.out.println(element));

        System.out.println("----------------------------------------");

        //we can combine intermediate operations
        list.stream()
                .distinct()
                .sorted()
                .forEach(element -> System.out.println(element));

        System.out.println("----------------------------------------");

        //map
        list.stream()
                .distinct()
                .map(e->e*e)
                .forEach(element -> System.out.println(element));

    }

    private static void streamTerminalOperations(List<Integer> list){
        int sum = IntStream.range(1,11)
                .reduce(0,(n1,n2) -> n1+n2);
        System.out.println(sum);

        //.get() ka use krna pr rha hai cause .max() return a optional class
        int maxValue = list.stream()
                .max((n1,n2)->Integer.compare(n1,n2))
                .get();

        System.out.println("max value "+maxValue);

        //here methods on optional class
        var optionalmaxValue = list.stream()
                .max((n1,n2)->Integer.compare(n1,n2));



        System.out.println("max optional ans "+optionalmaxValue);
        System.out.println("max optional value "+optionalmaxValue.get());
        System.out.println("max optional "+optionalmaxValue.isPresent());
        System.out.println("max optional "+optionalmaxValue.orElse(0)); //means if there was no value
        //then it will put 0 and return



        int minValue = list.stream()
                .min((n1,n2)->Integer.compare(n1,n2))
                .get();

        System.out.println("min value "+minValue);

        List<Integer> myNewList = list.stream()
                .filter(e -> e%2 ==1)
                .collect(Collectors.toList());

        System.out.println(myNewList.toString());

    }

}
