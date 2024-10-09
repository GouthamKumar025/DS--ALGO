class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer>map = new HashMap<>();
        
        for(long i: a1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(long j: a2){
            if(!map.containsKey(j) || map.get(j) == 0){
                return "No";
            }
            map.put(j,map.get(j)-1);
        }
        
        return "Yes";
        
    }
}
