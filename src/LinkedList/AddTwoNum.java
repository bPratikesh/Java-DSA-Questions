package LinkedList;

public class AddTwoNum {
    public static void main(String[] args) {
        Node<Integer> head1 = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        head1.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        Node<Integer> head2 = new Node<>(3);
        Node<Integer> nn1 = new Node<>(9);
        head2.next = nn1;
        //Node<Integer> r = reverserLinkedList(head);
        printLL(head1);
        printLL(head2);
        printLL(addTwoNum(head1, head2));
    }

    static Node<Integer> addTwoNum(Node<Integer> l1, Node<Integer> l2){
        Node<Integer> rev1 = reverserLinkedList(l1);
        Node<Integer> rev2 = reverserLinkedList(l2);

        int carry = 0;
        Node<Integer> answer = null;
        Node<Integer> temp = null;

        while (rev1 != null || rev2 != null || carry != 0){

            int sum = carry;
            if (rev1 != null){
                sum = sum + rev1.val;
                rev1 = rev1.next;
            }
            if (rev2 != null){
                sum = sum + rev2.val;
                rev2 = rev2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            Node<Integer> ansNode = new Node<>(digit);
            if (answer == null){
                answer = temp = ansNode;
            }
            else {
                temp.next = ansNode;
                temp = ansNode;
            }
        }

        return reverserLinkedList(answer);
    }

    static Node<Integer> reverserLinkedList(Node<Integer> head){
        if (head == null || head.next == null) return head;

        Node<Integer> prev = head;
        Node<Integer> curr = prev.next;
        head.next = null;

        while (curr != null){
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
