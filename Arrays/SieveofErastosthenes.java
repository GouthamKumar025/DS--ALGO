class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        boolean [] Prime = new boolean [N + 1];
        Arrays.fill(Prime, true);
        
        for(int i = 2; i * i <= N; i++){
            if(Prime[i]){
                for(int j = i * i; j <= N; j+= i){
                    Prime[j] = false;
                }
            }
        }
        
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=2;i<Prime.length;i++){
            if(Prime[i]){
                arr.add(i);
            }
        }
        
        return arr;
    }
}
