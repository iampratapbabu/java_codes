package dsajava;

public class Sorting {
	
	 private static void selectionSort(int arr[],int n){
		    
	        for(int i=0;i<n;i++){
	            int mini = i;
	            for(int j=i+1;j<n;j++){
	                if(arr[j]<arr[mini]){
	                    mini = j;
	                }
	            }
	            int temp = arr[mini];
	            arr[mini] = arr[i];
	            arr[i] = temp;
	        }
	        
	        //after selection sort
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]+",");
	        }
	        
	    }
	  
	 private static void bubbleSort(int arr[],int n){
	        //here n is size so last index is n-1
	        for(int i=n-1;i>=0;i--){
	            for(int j=0;j<i;j++){
	                if(arr[j]>arr[j+1]){
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	        //printing array after sorting
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]+",");
	        }
	    }
	  
	 private static void insertionSort(int arr[],int n){
	        //here n is size so last index is n-1
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                if(arr[i]>arr[j]){
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        //printing array after sorting
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]+",");
	        }
	    }

	public static void main(String[] args) {
	       int arr[] = {13, 46, 24, 52, 20, 9};
	        int n = arr.length;
	        selectionSort(arr,n);
	        bubbleSort(arr,n);
	        insertionSort(arr,n);
	}
}
