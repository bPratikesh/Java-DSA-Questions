package LinkedList;

public class RemoveDuplicate_II {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(3);
        Node<Integer> n5 = new Node<>(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printLL(removeDuplicateII(head));
    }
    static Node<Integer> removeDuplicateII(Node<Integer> head){
        Node<Integer> dummy = new Node<>(0);
        dummy.next = head;
        Node<Integer> prev = dummy;

        while (head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
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
