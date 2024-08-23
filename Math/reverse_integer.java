class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int rem = x % 10;
            // by multiplying 10 we can know that overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
            x /= 10;
        }

        return rev;
    }
}
