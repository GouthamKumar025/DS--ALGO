class Solution {
    public int reverse(int x) {
        int rev = 0;
        int sign = (x < 0)? -1: 1;
        x = Math.abs(x);
        while(x>0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x/=10;
        }
        rev *= sign;
        return rev;
    }
}
