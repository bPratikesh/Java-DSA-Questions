package LinkedList;

public class PalindromeLL {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(2);
       // Node<Integer> n4 = new Node<>(1);

        head.next = n1; n1.next = n2; n2.next = n3; //n3.next = n4;
        System.out.println(isLLPalindrome(head));
    }

    static boolean isLLPalindrome(Node<Integer> head){
        Node<Integer> middle = findMid(head);
        Node<Integer> t2 = reverseLL(middle);
        Node<Integer> t1 = head;

        while (t2 != null){
            if (t1.val != t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }

    static Node<Integer> reverseLL(Node<Integer> head){
        if (head == null && head.next == null) return head;

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

    static Node<Integer> findMid(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void printLL(Node<Integer> head){
        Node<Integer> temp = head;

        while (head != null){
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
    }
}
