package dsAlgorithm;

import java.util.ArrayList;

public class InsertionSort {
	

	public static void insertionSortArrayList(ArrayList<Integer> arr) {
	    
	   
	        for (int i = 1; i < arr.size(); ++i) {
	        	int key = arr.get(i);
	        	int j = i-1;
	        	while (j >= 0 && arr.get(j) > key) {
	        		arr.set(j + 1, arr.get(j));
	                j = j - 1;
	            }
	        	arr.set(j+1, key);
	        }
	            
	        
	        System.out.println(arr);
	   }
	        
	  
	
	
	   
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(55);
		arr.add(4);
		arr.add(78);
		arr.add(61);
		arr.add(1);
		
		insertionSortArrayList(arr);
	}

}


