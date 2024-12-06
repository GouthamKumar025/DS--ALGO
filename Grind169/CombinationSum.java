class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }

    public void findCombinations(int ind, int target, int [] candidates, List<List<Integer>>ans, List<Integer>ds){
        
        // base condition
        if(ind == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // picking up criteria
        if(candidates[ind] <= target){
            ds.add(candidates[ind]);
            findCombinations(ind,target-candidates[ind],candidates,ans,ds);
            ds.remove(ds.size()-1);
        }
        // non- picking up criteria
        findCombinations(ind+1,target,candidates,ans,ds);

    }
}
