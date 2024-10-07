package Arrays;

import  java.util.ArrayList;

public class RearrangeArray {

    public static void main(String[] args) {

        int[] nums = {3,1,-2,-5,2,-4};
        int n = nums.length;
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();

        int [] res = new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative.add(nums[i]);
            }else{
                positive.add(nums[i]);
            }
        }

        int counter = 0;
        for(int i=0;i<n/2;i++){
            res[counter] = positive.get(i);
            res[counter+1] = negative.get(i);
            counter += 2;
        }

      ArrayPrinter.printArray(res);

    }

}
