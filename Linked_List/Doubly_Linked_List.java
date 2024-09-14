class Node {
    int key;
    Node next;
    Node prev;

    public Node(int data) {
        key = data;
        next = null;
        prev = null;
    }
}

class Double_Linked_list {
    // Traverse the list in reverse order starting from the tail
    static Node rev(Node tail) {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.key + " ");
            curr = curr.prev;
        }
        return null;
    }
}

class Linked_List {
    // Traverse the list from the head to the tail
    static Node search(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key + " ");
            curr = curr.next;
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Set next and prev pointers to form a doubly linked list
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        // Traverse the list from head to tail
        System.out.print("Forward traversal: ");
        Linked_List.search(head);

        // Traverse the list from tail to head
        System.out.print("\nReverse traversal: ");
        Double_Linked_list.rev(fourth);
    }
}
