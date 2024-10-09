//https://www.geeksforgeeks.org/problems/count-digits5716/1

class Solution{
    static int evenlyDivides(int N){
        // code here
        
        // String s = String.valueOf(N);
        
        // Set<Character>unique = new HashSet<>();
        
        // StringBuilder sb = new StringBuilder();
        
        // for(char ch: s.toCharArray()){
        //     if(unique.add(ch)){
        //         sb.append(ch);
        //     }
        // }
        
        // int result = Integer.parseInt(sb.toString());
        
        
        
        int count = 0;
        int original = N;
        
        while(N > 0){
            int rem = N % 10;
            if(rem!=0 && original % rem == 0){
                count ++;
            }
            N/=10;
        }
        
        return count;
        
    }
}
