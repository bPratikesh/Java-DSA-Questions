package LinkedList;

public class MiddleNode {
    public static void main(String[] args) {
        Node2 head = new Node2(1);
        Node2 n1 = new Node2(2);
        Node2 n2 = new Node2(3);
        Node2 n3 = new Node2(4);
        Node2 n4 = new Node2(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printLL(head);
        Node2 mid = findMidNode(head);
        System.out.println(mid.val);

    }


    //BruteForce solution
    /*public static void findMidNode(Node2 head){
        Node2 temp = head;
        int count = 0;

        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        int jump = count/2;

        Node2 tempNew = head;
        for (int i=0; i<jump; i++){
            tempNew = tempNew.next;
        }
        System.out.println(tempNew.val);

    }*/

    //Optimized solution
    public static Node2 findMidNode(Node2 head){
        Node2 fastPtr = head;
        Node2 slowPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;

    }

    public static void printLL(Node2 head){
        Node2 temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Node2{
    int val;
    Node2 next;

    public Node2(int val) {
        this.val = val;
        this.next = null;
    }
}