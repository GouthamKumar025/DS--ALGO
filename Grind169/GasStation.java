class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int n = gas.length;
		int total_surplus = 0; // total surplus fuel
        int surplus = 0; // fuel in tank
        int start = 0;
        for(int i=0;i<n;i++){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start = i + 1;
            }
        }
        return total_surplus < 0 ? -1 : start;

    }
}
