package LinkedList;

public class IntersectionOfLinkedList {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(6);
        Node<Integer> n4 = new Node<>(2);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node<Integer> head2 = new Node<>(2);
        Node<Integer> m1 = new Node<>(4);
        Node<Integer> m2 = new Node<>(5);

        head2.next = m1;
        m1.next = m2;
        m2.next = n2;
        printLL(intersection(head, head2));
    }

    static Node<Integer>intersection(Node<Integer> head1, Node<Integer> head2){

        Node<Integer> t1 = head1; int n1=0;
        Node<Integer> t2 = head2; int n2=0;

        while (t1 != null){
            n1++;
            t1 = t1.next;
        }
        while (t2 != null){
            n2++;
            t2 = t2.next;
        }

        if (n1 < n2){
            return collisionPoint(head1, head2, n2-n1);
        }else {
            return collisionPoint(head2, head1, n1-n2);
        }
    }

    static Node<Integer> collisionPoint(Node<Integer> t1, Node<Integer> t2, int d){

        while (d != 0){
            d--;
            t2 = t2.next;
        }
        while (t1 != t2){
            t1 =  t1.next;
            t2 = t2.next;
        }
        return t1;
    }
    static void printLL(Node<Integer> head){
        while(head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}
