class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int longest = 1;
        // creating a set for storing the numbers
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // let it be the first element
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    cnt = cnt + 1;
                    x = x + 1;
                }
                longest = Math.max(longest, cnt);
            }

        }
        return longest;
    }
}
