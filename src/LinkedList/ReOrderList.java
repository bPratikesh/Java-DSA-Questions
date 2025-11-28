package LinkedList;

public class ReOrderList {
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

//        Node<Integer> mid = midNode(head);
//        printLL(mid);
        printLL(head);
        Node<Integer> r = reOrder(head);
        printLL(r);




    }

    static Node<Integer> reOrder(Node<Integer> head){
        Node<Integer> l2 = reverseLL(midNode(head));
        Node<Integer> l1 = head;

        while (l1 != null || l2 != null){
            if(l1 == l2){
                l1.next = null;
                break;
            }

            Node<Integer> l1Next = l1.next;
            Node<Integer> l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
        return head;
    }

    static Node<Integer> midNode(Node<Integer> head){

        Node<Integer> fastPtr = head;
        Node<Integer> slowPtr = head;

        while (fastPtr.next != null && fastPtr.next.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }
    static Node<Integer> reverseLL(Node<Integer> head){
        if (head == null || head.next == null) return head;

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
    static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
