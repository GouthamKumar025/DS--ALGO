class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long arr[] = new Long[2];
        Long lcm = (A * B) / gcd(A, B);
        arr[0] = lcm;
        arr[1] = gcd(A,B);
        return arr;
        
    }
    
    static Long gcd(Long A, Long B){
        if(B==0){
            return A;
        }
        return gcd(B,A%B);
    }
};
