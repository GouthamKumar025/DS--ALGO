class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    // two pointer approach TC - O(n log n + m log m)
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int i=0;
        int j = 0;
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i < n && j < m){
            //handling duplicates
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            
            if(a[i] == b[j]){
                count ++;
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return count;
    }
};


// approach - 2
// using hashset - TC  O(n + m) 
// public static int countIntersection(int[]a,int[]b,int n,int m){
//   HashSet<Integer>set = new HashSet<>();
//   for(int i=0;i<n;i++){
//     set.add(a[i]);
//   }

// int count = 0;
// for(int j=0;j<m;j++){
//   if(set.contains(b[j]){
//     count++;
//     set.remove(b[j]);
//   }
// }
// return count;
// }
