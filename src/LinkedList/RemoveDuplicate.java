package LinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node<Integer> headNew = removeDuplicateElement(head);
        printLL(headNew);
    }
    static Node<Integer> removeDuplicateElement(Node<Integer> head){

        Node<Integer> current = head;

        while (current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return  head;
    }
    static void printLL(Node<Integer> head){
        while (head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}
