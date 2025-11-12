package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        Node<Integer> newHead = reverse(head);
        printLL(newHead);
    }

    public static Node<Integer> reverse(Node<Integer> head){
        if (head == null && head.next == null) return head;

        Node<Integer> prev = head;
        Node<Integer> curr = head.next;
        head.next = null;

        while (curr != null){
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
