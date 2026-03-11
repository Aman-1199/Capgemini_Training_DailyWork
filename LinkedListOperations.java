import java.util.Scanner;

public class LinkedListOperations {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insertFront(int value) {
        Node n = new Node(value);
        n.next = head;
        head = n;
        display();
    }

    static void insertBack(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
        display();
    }

    static void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertFront(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid index");
        } else {
            Node n = new Node(value);
            n.next = temp.next;
            temp.next = n;
        }
        display();
    }

    static void deleteFront() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
        display();
    }

    static void deleteBack() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
        display();
    }

    static void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            display();
            return;
        }

        if (index == 0) {
            deleteFront();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid index");
        } else {
            temp.next = temp.next.next;
        }
        display();
    }

    static void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            display();
            return;
        }

        if (head.data == value) {
            head = head.next;
            display();
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
        } else {
            temp.next = temp.next.next;
        }
        display();
    }

    static void display() {
        System.out.print("Linked List: ");
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert Front");
            System.out.println("2. Insert Back");
            System.out.println("3. Insert at Index");
            System.out.println("4. Delete Front");
            System.out.println("5. Delete Back");
            System.out.println("6. Delete at Index");
            System.out.println("7. Delete by Value");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                insertFront(sc.nextInt());
            }
            else if (choice == 2) {
                System.out.print("Enter value: ");
                insertBack(sc.nextInt());
            }
            else if (choice == 3) {
                System.out.print("Enter value: ");
                int value = sc.nextInt();
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                insertAtIndex(value, index);
            }
            else if (choice == 4) {
                deleteFront();
            }
            else if (choice == 5) {
                deleteBack();
            }
            else if (choice == 6) {
                System.out.print("Enter index: ");
                deleteAtIndex(sc.nextInt());
            }
            else if (choice == 7) {
                System.out.print("Enter value: ");
                deleteByValue(sc.nextInt());
            }
            else {
                break;
            }
        }
        sc.close();
    }
}
