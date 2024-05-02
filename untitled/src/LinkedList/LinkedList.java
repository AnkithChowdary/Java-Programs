package LinkedList;

import java.util.Scanner;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    void addFirst(int v) {
        Node newnode = new Node(v);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    void addLast(int v) {
        Node newnode = new Node(v);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Can't delete as List is empty");
            return;
        }
        head=head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("Can't delete as List is empty");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void insertIndex(int x,int val){
        Node t=head;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        Node newnode=new Node(val);
        if(x==0){
            head=tail=newnode;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < x - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        tail = newnode;
    }

    void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    Node reverseList(){
        Node current=head,pre=null,nextnode;
        while(current!=null){
            nextnode=current.next;
            current.next=pre;
            pre=current;
            current=nextnode;
        }
        return pre;
    }
    void insertMiddle(int val) {
        if (head == null) {
            head = tail = new Node(val);
            return;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newnode = new Node(val);

        newnode.next = slow.next;
        slow.next = newnode;

        if (newnode.next == null) {
            tail = newnode;
        }
    }

    boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; // Element found
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element at the beginning");
            System.out.println("2. Add element at the end");
            System.out.println("3. Delete first element");
            System.out.println("4. Delete last element");
            System.out.println("5. Insert element at index");
            System.out.println("6. Insert element in the middle");
            System.out.println("7. Search for an element");
            System.out.println("8. Reverse the list");
            System.out.println("9. Print the list");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    int val1 = scanner.nextInt();
                    li.addFirst(val1);
                    break;
                case 2:
                    System.out.print("Enter value to add at the end: ");
                    int val2 = scanner.nextInt();
                    li.addLast(val2);
                    break;
                case 3:
                    li.deleteFirst();
                    break;
                case 4:
                    li.deleteLast();
                    break;
                case 5:
                    System.out.print("Enter index to insert: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int val3 = scanner.nextInt();
                    li.insertIndex(index, val3);
                    break;
                case 6:
                    System.out.print("Enter value to insert in the middle: ");
                    int val4 = scanner.nextInt();
                    li.insertMiddle(val4);
                    break;
                case 7:
                    System.out.print("Enter value to search: ");
                    int searchKey = scanner.nextInt();
                    if (li.search(searchKey)) {
                        System.out.println("Element found in the list.");
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;
                case 8:
                    head = li.reverseList();
                    break;
                case 9:
                    li.printList();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 10.");
            }
        } while (choice != 10);

        scanner.close();
    }

}
