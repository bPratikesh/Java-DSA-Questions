package Stack;

public class StackUsingArrays {
    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
//        stack.printStack();
//        stack.push(1);
//        stack.printStack();
//        stack.pop();
//        stack.printStack();
//        System.out.println(stack.peek());
        //Iterating stack
        while (!stack.isStackEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    private int size;
    private int a[];
    private int top;

    public StackUsingArrays(int size){
        this.size = size;
        a = new int[size];
        top = -1;
    }

    public boolean push(int data){
        if(isStackFull()){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top++;
            a[top] = data;
            return true;
        }
    }

    public int pop(){
        if(isStackEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int temp = a[top];
            top--;
            return temp;
        }
    }

    public int peek(){
        if (isStackEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return a[top];
        }
    }

    public boolean isStackEmpty(){
        return top == -1;
    }

    public boolean isStackFull(){
        return top == size-1;
    }

    public void printStack(){
        for (int i=0; i<=top; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
