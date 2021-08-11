package dsAlgorithm;

public class MergeSort {
	
	public static void main(String[] args) {
		
		
		String[] arr= {"Shreya","Krati","Disha","Virat","Pravigya","Akshat"};
		int start=0,end=arr.length-1;
		mergeSort(arr,start,end);
		printStringArr(arr);

	}
	
	public static void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}

	}
	private static void merge(String[] arr, int start, int mid, int end) {
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}

	}
	
	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
