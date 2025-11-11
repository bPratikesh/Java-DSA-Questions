package LinkedList;

public class BasicOperations {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);

        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

//        head = insertElement(2, 100, head);
//        deleteElement(1, head);
        printLinkedList(head);

        Node<Integer> newHead = removeDuplicateElement(head);
        System.out.println();
        printLinkedList(newHead);

    }

    public static Node<Integer> removeDuplicateElement(Node<Integer> head){
        Node<Integer> original = head;
        Node<Integer> temp = head;
        Node<Integer> newHead = null;

        while (original != null){
            while (original.next != null && original.val == original.next.val){
                original = original.next;
            }

            if (newHead == null){
                newHead = temp = original;
            }
            else {
                temp.next = original;
                temp = original;
            }
            original = original.next;
        }
        return newHead;
    }

    public static Node<Integer> deleteElement(int position, Node<Integer> head){

        if(position == 0){
            return head.next;
        }

        Node<Integer> temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static Node<Integer> insertElement(int position, int data, Node<Integer> head){
        Node<Integer> newNode = new Node<>(data);
        if(position == 0){
            newNode.next = head;
            return newNode;
        }

        Node<Integer> temp = head;
        for (int i=0; i<position-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(" "+temp.val);
            temp = temp.next;
        }
    }

}

class Node<E> {

    E val;
    Node<E> next;

    public Node(E val) {
        this.val = val;
        this.next = null;
    }
}
