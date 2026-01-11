package Stack;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //Iterating stack
        while (!stack.isStackEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    Node head;

    boolean isStackEmpty(){
        return head == null;
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop(){
       if (isStackEmpty()){
           System.out.println("Stack is empty");
           return -1;
       }else{
           int temp = head.data;
           head = head.next;
           return temp;
       }
    }

    int peek(){
        if (isStackEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return head.data;
        }
    }


}
