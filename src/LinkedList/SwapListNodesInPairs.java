package LinkedList;

public class SwapListNodesInPairs {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printLL(swapList(head));

    }

    static Node<Integer> swapList(Node<Integer> head){
        Node<Integer> dummy = new Node<>(0);
        dummy.next = head;

        Node<Integer> startingPoint = dummy;

        while (startingPoint.next != null && startingPoint.next.next != null){
            Node<Integer> swap1 = startingPoint.next;
            Node<Integer> swap2 = startingPoint.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;

            startingPoint.next = swap2;
            startingPoint = swap1;
        }
        return dummy.next;
    }

    static void printLL(Node<Integer> head){
        while (head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}
