package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 7, 4, 1, 6, 14, 21 };
		int n = arr.length;
		quicksort(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				swap(arr,pIndex,i);
				pIndex++;
			}
		}
		swap(arr,pIndex,end);
		
		return pIndex;
	}
	
	public static void swap(int [] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void quicksort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			quicksort(arr, start, pIndex - 1);
			quicksort(arr, pIndex + 1, end);
		}
	}

}
