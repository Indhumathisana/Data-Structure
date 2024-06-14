 //DoublyLinkedList deletion
 
 
 import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;
}
class DoublyLinkedList {
    Node head, last;
}
public class Main {
    static Node head, last;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        head = null;
        last = null;
        int n = scanner.nextInt();
                    createList(n);
                    deleteFromEnd();
                    deleteFromBeginning();
                                   System.out.print("Enter the node position which you want to delete: ");
                    int position = scanner.nextInt();
                    deleteFromN(position);
      
                              displayList();
    }

 static void createList(int n) {
        int i, data;
        Node newNode;
        Scanner scanner = new Scanner(System.in);
        if (n >= 1) {
            head = new Node();
            System.out.print("Enter data of 1st node: ");
            data = scanner.nextInt();
            head.data = data;
            head.prev = null;
            head.next = null;
            last = head;
            for (i = 2; i <= n; i++) {
                newNode = new Node();
                System.out.print("Enter data of " + i + " node: ");
                data = scanner.nextInt();
                newNode.data = data;
                newNode.prev = last;
                newNode.next = null;
                last.next = newNode;
                last = newNode;
            }
        }
}
    public static void displayList() {
        Node temp;
        int n = 1;
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            temp = head;
            System.out.println("DATA IN THE LIST:");
            while (temp != null) {
                System.out.println("DATA of " + n + " node = " + temp.data);
                n++;
                temp = temp.next;
            }
        }
    }
     public static void deleteFromBeginning() {
        Node toDelete;
        if (head == null) {
            System.out.println("Unable to delete. List is empty.");
        } else {
            toDelete = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            toDelete.next = null;
            toDelete.prev = null;
            System.out.println("SUCCESSFULLY DELETED NODE FROM BEGINNING OF THE LIST.");
        }
    }
        public static void deleteFromEnd() {
        Node toDelete;

        if (last == null) {
            System.out.println("Unable to delete. List is empty.");
        } else {
            toDelete = last;

            last = last.prev;
            if (last != null) {
                last.next = null;
            }

            toDelete.next = null;
            toDelete.prev = null;

            System.out.println("SUCCESSFULLY DELETED NODE FROM END OF THE LIST.");
        }
    }

     public static void deleteFromN(int position) {
        Node current = head;
        int i;

        for (i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (position == 1) {
            deleteFromBeginning();
        } else if (current == last) {
            deleteFromEnd();
        } else if (current != null) {
            current.prev.next = current.next;
            current.next.prev = current.prev;

            current.next = null;
            current.prev = null;

            System.out.println("SUCCESSFULLY DELETED NODE FROM " + position + " POSITION.");
        } else {
            System.out.println("Invalid position!");
        }
    }
}