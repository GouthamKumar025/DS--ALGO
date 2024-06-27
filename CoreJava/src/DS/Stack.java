package DS;

class Stack {

    private int top;
    final int capacity;
    final int arr[];

    // initializing the stack
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void pushStack(int val){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + val);
        arr[++top] = val;
    }

    int popStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("Popping out");
        return arr[top--];
    }

    // getting the size of the stack

    int getsize(){
        return top + 1;
    }

    //checking whether the stack is full

    boolean isFull(){
        return top == capacity - 1;
    }

    //checking whether the stack is empty
    boolean isEmpty(){
        return top == -1;
    }

    void printStack(){
        for(int i=0;i<= top;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.pushStack(2);
        stack.pushStack(4);
        stack.pushStack(7);
        stack.printStack();
        stack.popStack();
        stack.printStack();

    }
}
