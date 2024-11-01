class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max_area = Integer.MIN_VALUE;
        while(l < r){
            int w = r - l;
            int h = Math.min(height[l],height[r]);
            int area = w * h;
            max_area = Math.max(max_area,area);

            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max_area;
    }
}
