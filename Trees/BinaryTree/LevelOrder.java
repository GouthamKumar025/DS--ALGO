class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer>temp = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                temp.add(curr.data);
                if(curr.left !=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                
            }
            ans.add(temp);
            
        }
        return ans;
    }
}
