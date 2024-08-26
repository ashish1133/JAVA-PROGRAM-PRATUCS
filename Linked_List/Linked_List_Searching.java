package Linked_List;

class Node{
    int Data;
    Node next;
    public Node(int New_Data ){
        Data = New_Data;
        next =  null;
    }
}
public class Linked_List_Searching {
    public static void Searching(Node head) {

        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.Data);
            curr = curr.next;
        }
        System.out.println();
    }
}
class Linked{

    public static void main(String[] args) {

            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);

            Linked_List_Searching.Searching(head);

    }
}
