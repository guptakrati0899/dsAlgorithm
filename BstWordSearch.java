package dsAlgorithm;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BstWordSearch {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		String str = getFromFile("C:/Users/Asus/eclipse-workspace/dsAlgorithm/Demofolder/demotext.txt");
		String[] strArr = str.split(" ");
		for(String word:strArr) {
			System.out.print(word);
		}
		System.out.println();
		System.out.println("Enter key to search : ");
		String key = S.next();
		int index = binarySearch(strArr, key);
		if (index >= 0)
			System.out.println("Key found at index " + index + " which is " + strArr[index]);
		else if(index==-1) {
			System.out.println("Key not found. Please Enter a Valid Key!");
		}
		
		S.close();
	}


	public static String getFromFile(String path) {
		BufferedReader bufferReader = null;
		String str = "";
		try {
			bufferReader = new BufferedReader(new FileReader(path));
			str = bufferReader.readLine();
			bufferReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public static int binarySearch(String[] strArr, String key) {
		int start = 0, end = strArr.length - 1, mid;
		strArr = bubbleSort(strArr);
		for(String word:strArr) {
			System.out.print(word+" ");
		}
		while (start <= end) {
			mid = start + end / 2;

			if (strArr[mid].equals(key)) {
				return mid;
			}
			else if (strArr[mid].compareTo(key) < 0) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	

	public static String[] bubbleSort(String[] arr) {
		String temp;
		for (int j = 0; j < arr.length; j++) {
		   	   for (int i = j + 1; i < arr.length; i++) {
				// comparing adjacent strings
				if (arr[i].compareTo(arr[j]) < 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			   }
		}
		return arr;
	}
	}


