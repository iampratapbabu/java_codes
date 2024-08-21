package Arrays;


import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args){
        System.out.println("Longest SubArray Program Start");

        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k=1;

        HashMap<Integer,Integer> myMap = new HashMap<>();

        int prefixSum =  0;
        int tempLength = 0;
        int maxLength = 0;

       for(int i = 0;i<arr.length;i++){
           prefixSum += arr[i];
           if(prefixSum == k){
               tempLength = i+1; //jitna index of array hoga usme +1 kr denge to size of subarray mil jayega
           }
           System.out.println(arr[i]);

       }

        System.out.println("Longest Subarray is: "+maxLength);

    }
}
