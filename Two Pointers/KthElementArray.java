
class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        List<Integer>ans = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                ans.add(arr2[j]);
                j++;
            }
            else{
                ans.add(arr1[i]);
                ans.add(arr2[j]);
                i++;
                j++;
            }
            
        }
        
        while(i < arr1.length){
            ans.add(arr1[i]);
            i++;
        }
        while(j < arr2.length){
            ans.add(arr2[j]);
            j++;
        }
        
        
        return (long)ans.get(k-1);
    }
}
