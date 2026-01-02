package LinkedList;

public class PartitionList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(6);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(2);
        Node<Integer> n4 = new Node<>(10);
        int k=3;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node<Integer> headPartition = partitionList(head, k);
        printLl(headPartition);
    }

    static Node<Integer> partitionList(Node<Integer> head, int k){
        Node<Integer> leftHead = new Node<>(-1);
        Node<Integer> rightHead = new Node<>(-1);

        Node<Integer> leftTail = leftHead;
        Node<Integer> rightTail = rightHead;

        Node<Integer> current = head;

        while (current != null){
            if (current.val < k){
                leftTail.next = current;
                leftTail = current;
            }else {
                rightTail.next = current;
                rightTail = current;
            }
            current = current.next;
        }
        rightTail.next = null;
        leftTail.next = rightHead.next;

        return leftHead.next;
    }

    static void printLl(Node<Integer> head){
        while (head != null){
            System.out.print(head.val+ "->");
            head = head.next;
        }
        System.out.println();
    }
}
