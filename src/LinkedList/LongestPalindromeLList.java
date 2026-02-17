package LinkedList;

public class LongestPalindromeLList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(6);
        Node<Integer> n2 = new Node<>(6);
        Node<Integer> n3 = new Node<>(1);
        Node<Integer> n4 = new Node<>(10);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(longestPalindromeLL(head));
    }

    static int longestPalindromeLL(Node<Integer> head){
        if (head == null) return 0;
        if(head.next == null) return 1;

        Node<Integer> prev = null;
        Node<Integer> curr = head;
        int ans = 0;

        while (curr != null){
            Node<Integer> next = curr.next;
            curr.next = prev;

            int oddLengthMatch = longestMatchingLL(prev, next);
            int oddPalindromeLength = 2 * oddLengthMatch + 1;

            int evenLengthMatch = longestMatchingLL(curr, next);
            int evenPalindromeLength = 2 * evenLengthMatch;

            int biggerPalindrome = Math.max(oddPalindromeLength, evenPalindromeLength);
            ans = Math.max(ans, biggerPalindrome);
            prev = curr;
            curr = next;
        }
        return ans;
    }

    static int longestMatchingLL(Node<Integer> a, Node<Integer> b){
        int count = 0;
        while (a != null && b !=  null){
            if (a.val == b.val){
                count++;
                a = a.next;
                b = b.next;
            }else {
                break;
            }
        }
        return count;
    }
}
