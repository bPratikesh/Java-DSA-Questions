package LinkedList;

public class KthNodeFromMiddle {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        int k = 1;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(KthNode(head, k));

    }
    static int KthNode(Node<Integer> head, int k){
        int mid = middleElement(head);
        if (k > mid) return -1;
        for (int i = 0; i < mid - k; i++){
            head = head.next;
        }
        return head.val;
    }
    static int middleElement(Node<Integer> head){
        Node<Integer> fastPtr = head;
        Node<Integer> slowPtr = head;
        int count = 0;

        while (fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            count++;
        }
        return count;
    }
}
