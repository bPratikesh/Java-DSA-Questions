package LinkedList;

public class DeleteMidNodeOfLL {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        printLL(findMid(head));
    }
    static Node<Integer> findMid(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        fast = fast.next.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static void printLL(Node<Integer> head){
        while (head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }

}
