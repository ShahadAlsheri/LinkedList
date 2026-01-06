/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1test;

/**
 *
 * @author shaha
 */
import java.util.*;

class Node {

    int data;		// data field
    Node next;		// pointer to the next node

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

public class Assignment1test {

    public static Node deleteNodes(Node head, int m, int n) {
        Node ptr = head;
        Node ptr2 = head;
        while (ptr.next != null) {
            if (m > 0 & head != null) {
                for (int i = 0; i < m - 1; i++) {
                    if (ptr.next != null) {
                        ptr = ptr.next;
                    }
                }
                if (n > 0 & head != null) {
                    for (int i = 0; i < n; i++) {
                        if (ptr.next != null) {
                            ptr.next = ptr.next.next;
//                                ptr = ptr.next;
                        }
                    }
                }
            }
                else if (m == 0 || head == null) {
                    return head;
                }
        }
 while (ptr2 != null) {
            System.out.print(ptr2.data + " -> ");
            if (ptr2.next == null) {
                System.out.println(" null,");
            }
            ptr2 = ptr2.next;
        }
        return head;
    }

//    public static void Print(Node head) {
//        Node ptr = head;
//        while (ptr2 != null) {
//            System.out.print(ptr2.data + " -> ");
//            if (ptr2.next == null) {
//                System.out.println(" null,");
//            }
//            ptr2 = ptr2.next;
//        }
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = (int) (1 + Math.random() * 10);
//        int s = 10;
        int[] array = new int[s];
        System.out.println(s);
        Node head = null;
        for (int i = 0; i < s; i++) {
            array[i] = (int) (1 + Math.random() * 10);
//            head = new Node(array[i], head);
if (head == null ) {
            head = new Node(array[i], head);
        } // ELSE, we have a list. Insert the new node at the correct location
        else {
            // We need to traverse to the correct insertion location...so we need a help ptr
            Node helpPtr = head;
            // Traverse to correct insertion point
            // Now make the new node. Set its next to point to the successor node.
            // And then make the predecessor node point to the new node
            Node newNode = new Node(array[i], helpPtr.next);
            helpPtr.setNext(newNode);
        }
            System.out.print(array[i] + " -> ");
        }
        System.out.println();

        int m = (int) (Math.random() * 10);
        int n = (int) (1 + Math.random() * 10);
//        System.out.print("enter m: ");
//        int m = input.nextInt();
//        System.out.print("enter n: ");
//        int n = input.nextInt();
        System.out.println("m = " + m + " n =  " + n);

        Node no = deleteNodes(head, m, n);
//        Print(no);

    }
}
