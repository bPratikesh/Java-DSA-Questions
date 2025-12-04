package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLL {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(-1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n2 = new Node<>(-7);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        Node<Integer> head2 = new Node<>(-3);
        Node<Integer> m1 = new Node<>(7);
        Node<Integer> m2 = new Node<>(6);
        Node<Integer> m3 = new Node<>(5);

        head2.next = m1;
        m1.next = m2;
        m2.next = m3;

        printArray(mergeTwoLL(head, head2));
    }

//    Brute force
    static Node<Integer> mergeTwoLL(Node<Integer> l1, Node<Integer>l2){

        ArrayList<Integer> arr = new ArrayList<>();
        Node<Integer> temp1 = l1;
        Node<Integer> temp2 = l2;

        while (temp1 != null){
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null){
            arr.add(temp2.val);
            temp2 = temp2.next;
        }

        Collections.sort(arr);
        Node<Integer> head = convertArrToLL(arr);
        return head;
    }

//    function to convert an array to ll
    static Node<Integer> convertArrToLL(ArrayList<Integer> arr){
        Node<Integer> dummyNode = new Node<>(-1);
        Node<Integer> temp = dummyNode;

        for (int i=0; i<arr.size(); i++){
            temp.next = new Node<>(arr.get(i));
            temp = temp.next;
        }
        return dummyNode.next;
    }

    static void printArray(Node<Integer> head){
        while (head != null){
            System.out.print(head.val+" -->");
            head = head.next;
        }
        System.out.println();
    }
}
