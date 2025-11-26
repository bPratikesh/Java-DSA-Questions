package LinkedList;

public class RemoveNthNode {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;
        printLL(removeNnode(head,1));

    }
    static Node<Integer> removeNnode(Node<Integer> head, int n){
        int count = 0;
        Node<Integer> temp = head;

        while (temp != null){
            count++;
            temp = temp.next;
        }
        if (n >= count){
            return head.next;
        }
        temp = head;
        for (int i = 1; i < count - n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    static void printLL(Node<Integer> head){
        while(head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}
