package LinkedList;

public class ListCycle {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(3);
        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n2;

        Node<Integer> newNode = ListCycleInLL(head);
        System.out.println(newNode.val);

    }

    static Node<Integer> ListCycleInLL(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;

        Node<Integer> start = head;
        Node<Integer> meet = slow;
        while (start != meet){
            start = start.next;
            meet = meet.next;
        }
        return start;

    }
}
