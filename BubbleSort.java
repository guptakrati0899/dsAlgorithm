package dsAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSortArrayList(ArrayList<Integer> arr) {
	    Integer temp = 0;
	    boolean sorted = false;

	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < arr.size()-1; i++) {
	            if (arr.get(i).compareTo(arr.get(i + 1)) > 0) {
	                temp = arr.get(i);
	                arr.set(i, arr.get(i + 1));
	                arr.set(i + 1, temp);
	                sorted = false;
	               
	            }
	           
	        }
	        
	      
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
		
		bubbleSortArrayList(arr);
	}

}
