class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int low = Arrays.stream(bloomDay).min().orElseThrow();
        int high = Arrays.stream(bloomDay).max().orElseThrow();
        int minDays = -1;
        while (low <= high) {
            int mid = low +(high-low) / 2;
            if (countBouquets(bloomDay, m, k, mid)) {
                minDays = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minDays;
    }

    public boolean countBouquets(int[] bloomDay, int m, int k, int mid) {
        int count = 0;
        int count_bouquets = 0;
        for (int day : bloomDay) {
            if (day <= mid) {
                count++;
                if (count == k) {
                    count_bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return count_bouquets >= m;
    }
}
