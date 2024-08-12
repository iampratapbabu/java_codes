package Arrays;


public class LongestSubarray {
    public static void main(String[] args){
        System.out.println("Longest SubArray Program Start");

        int[] arr = {2,-1,1,-1,1,2,1};
        int k=1;
        int tempSum =  0;
        int tempLength = 0;
        int maxLength = 0;

        for (int element : arr) {
            tempSum += element;
            tempLength += 1;
            if(tempSum == k){
                if(tempLength > maxLength){
                    maxLength = tempLength;

                }
                tempLength = 0;
            }
        }

        System.out.println("Longest Subarray is: "+maxLength);

    }
}
