package sorting;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21,3,9,1,7};
		merge(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] mergesort(int [] A, int [] left, int [] right) {
		int n = A.length;
		int nL = left.length;
		int nR = right.length;
		
		int i= 0;
		int j = 0;
		int k = 0;
		
		// comparing the two arrays both indexes with two pointers and then fill the original array.
		
		while(i < nL && j < nR) {
			if(left[i] < right[j]) {
				A[k] = left[i];
				k++;
				i++;
			}
			else {
				A[k] = right[j];
				k++;
				j++;
			}
		}
		// checking for the leftover element in the left array when the right subarray is completely processed and sorted.
		while(i < nL) {
			A[k] = left[i];
			k++;
			i++;
		}
		// checking for the leftover element in the right array when the left subarray is completely processed and sorted.
		while(j < nR) {
			A[k] = right[j];
			k++;
			j++;
		}
		
		return A;
	}
	
	
	public static void merge(int[] arr) {
		int n = arr.length;
		while(n < 2) {
			return;
		}
		int mid = n / 2;
		
//		int left_size = mid;
//		int right_size = n - mid;
		
		int [] left = new int [mid];
		int [] right = new int [n - mid];
		
		for(int i=0; i < mid;i++) {
			left[i] = arr[i];
		}
		for(int j = mid ; j < n; j++) {
			right[j - mid] = arr[j];
		}
		merge(left);
		merge(right);
		mergesort(arr,left,right);
	}

}
