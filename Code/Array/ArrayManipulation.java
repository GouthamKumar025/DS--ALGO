package camp;

public class ArrayManipulation {
	
	// traversal of array
	static void traversal(int[]arr) {
		System.out.println("Array Traversal");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	
	//insertion in a array
	static void insert(int[]arr,int pos,int element) {
		System.out.println("Array Insertion");
		for(int i = arr.length-1; i >= pos ; i --) {
			arr[i] = arr[i-1];
			arr[pos-1] = element;
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
		System.out.println(" ");
	}
	
	//deletion in a array
	static void delete(int[]arr,int pos) {
		System.out.println("Array Deletion");
		int[]deleted_arr = new int[arr.length-1];
		int j = pos;
		for (int i = 0,z = 0;i<arr.length;i++) {
			if(i!=j) {
				deleted_arr[z] = arr[i];
				z++;
			}
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
		System.out.println(" ");
	}
	
	//searching in a array
	static boolean search(int[]arr,int element) {
		System.out.println("Array Searching");
		int p = element;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==p) {
				return true; 
			}
		}
		return false;
	}
	
	//updating in a array
	static void update(int[]arr,int element,int index) {
		System.out.println("Array Updation");
		for(int i=0;i<arr.length;i++) {
			arr[index] = element;
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {7,42,13,65,36,87,92};
		traversal(arr);
		insert(arr,4,27);
		delete(arr,3);
		System.out.println(search(arr,13));
		update(arr,34,2);
	}
}
