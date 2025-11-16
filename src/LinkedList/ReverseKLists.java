package LinkedList;

public class ReverseKLists {
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

        int k = 3;
        printLL(head);
        Node<Integer> reverseHead = reverseKLists(head, k);
        printLL(reverseHead);

    }

    static Node<Integer> reverseKLists(Node<Integer> head, int k){
        Node<Integer> dummy = new Node<>(-1);
        dummy.next = head;

        Node<Integer> prevTail = dummy;
        Node<Integer> currHead = head;

        while (currHead != null){
            Node<Integer> currTail = currHead;
            for (int i=0; i<k-1; i++){
                if (currTail == null) break;
                currTail = currTail.next;
            }

            if (currTail == null) break;
            Node<Integer> nextHead = currTail.next;
            reverseKTimes(currHead, k);

            prevTail.next = currTail;
            currHead.next = nextHead;
            prevTail = currHead;
            currHead = nextHead;
        }
        prevTail.next = currHead;
        return dummy.next;
    }

    static Node<Integer> reverseKTimes(Node<Integer> head, int k){
        if (head == null || head.next == null) return head;

        Node<Integer> prev = null;
        Node<Integer> curr = head;
        int count = 0;

        while (curr != null && count < k){
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        return prev;
    }

    static void printLL(Node<Integer> head){
        while (head != null){
            System.out.print(head.val+ "->");
            head = head.next;
        }
        System.out.println();
    }
}
