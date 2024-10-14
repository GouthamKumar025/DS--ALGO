class Solution {
    public static int findUnion(int a[], int b[]) {
        // Your code here
        HashSet<Integer>set = new HashSet<>();
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                set.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                set.add(b[j]);
                j++;
            }
            else{
                set.add(a[i]);
                i++;
                j++;
            }
        }
        while(i < a.length){
            set.add(a[i]);
            i++;
        }
        while(j < b.length){
            set.add(b[j]);
            j++;
        }
        
        return set.size();
    }
}
