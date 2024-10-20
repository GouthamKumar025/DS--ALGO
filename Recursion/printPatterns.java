https://www.geeksforgeeks.org/problems/print-pattern3549/1?page=1&category=Recursion&difficulty=Easy&sortBy=submissions
class Solution{
    public List<Integer> pattern(int N){
        // code here
        ArrayList<Integer>arr = new ArrayList<>();
        
        addElements(N,arr);
        
        return arr;
    }
    
    public void addElements(int N, ArrayList<Integer>arr){
        
        arr.add(N);
        
        if(N <= 0){
           return;
        }
        
        addElements(N-5,arr);
        
        arr.add(N);
    }
}
