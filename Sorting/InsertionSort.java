public class Main {
  public static void main(String[] args) {
    int [] arr = {24,13,8,31,2,9};
    sort(arr);
  }

  public static void sort(int []arr){
    int n = arr.length;
    for(int i=0;i<=n-1;i++){
      int j = i;
      while(j > 0 && arr[j-1] > arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }

    for(int num:arr){
      System.out.print(num + " ");
    }
  }
}
