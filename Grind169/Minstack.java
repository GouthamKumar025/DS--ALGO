class MinStack {
     
     Stack<Integer>stack = new Stack<>();
     Stack<Integer>minstack = new Stack<>();

    public void push(int val) {
        if(minstack.isEmpty() || val <= minstack.peek()){
            minstack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
