class Solution {
    public int atoi(char s[]) {
        // code here
        int ans = 0;
        int start = 0;
        if(s[0]=='-'){
            start = 1;
        }
        
        for(int i=start;i<s.length;i++){
            if(s[i] < '0' || s[i] > '9'){
                return -1;
            }
            ans = ans * 10 + (s[i] - '0');
        }
        
        if(start == 1){
            return -ans;
        }
        
        return ans;
    }
}
