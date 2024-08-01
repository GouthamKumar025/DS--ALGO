class GfG {
    void printPat(int n) {
        // Your code here
        for(int i = 0;i<n;i++){
            for(int j=n;j>=1;j--){
                for(int k=1;k<=n-i;k++){
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }
}


3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
