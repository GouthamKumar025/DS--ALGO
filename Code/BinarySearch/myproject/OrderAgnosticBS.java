package myproject;

import java.util.*;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 92, 87, 64, 53, 47, 39, 21, 17, 9 };
		int target = 39;
		System.out.println(binarysearch(a, target));

	}

	static int binarysearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;
		boolean isAsc=arr[start]<arr[end];// determining whether the given array is ascending or descending
		/*if (start < end) {
			isAsc = true;
		} else {
			isAsc = false;
		}*/
		while (start <= end) {
			mid=start+(end-start)/2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start=mid+1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;

	}
}
