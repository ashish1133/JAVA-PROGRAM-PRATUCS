class Node {
    int data;
    Node prev, next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class Head {

    static Node insertBegin(Node head, int data) {

        // Create a new node
        Node new_node = new Node(data);

        // Make next of it as head
        new_node.next = head;

        // Set previous of head as new node
        if (head != null) {
            head.prev = new_node;
        }

        // Return new node as new head
        return new_node;
    }

    // Print the doubly linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hardcoded doubly linked list:
        // 2 <-> 3 <-> 4
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        // Print the original list
        System.out.print("Original Linked List: ");
        printList(head);

        // Insert a new node at the front of the list
        head = insertBegin(head, 1);

        // Print the updated list
        System.out.print(
                "After inserting Node 1 at the front: ");
        printList(head);
    }
}
