package LinkedList;

public class SortBinaryList {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(0);
        Node<Integer> n2 = new Node<>(0);
        Node<Integer> n3 = new Node<>(1);
        Node<Integer> n4 = new Node<>(0);
        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        Node<Integer> HeadNode = sortLL(head);
        printLL(HeadNode);
    }
    //Approach: data replacement
    static Node<Integer> sortLL(Node<Integer> head){
        int countZero = 0;
        int countOne = 0;
        Node<Integer> temp = head;
        while (temp != null){
            if (temp.val == 0) countZero++;
            else countOne++;
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            if (countZero != 0){
                temp.val = 0;
                countZero--;
            } else if (countOne != 0) {
                temp.val = 1;
                countOne--;
            }
            temp = temp.next;
        }
        return head;
    }
    static void printLL(Node<Integer> head){
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
