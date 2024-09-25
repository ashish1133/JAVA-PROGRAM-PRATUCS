class Node{
    int data;
    Node left,right;
    public Node(int Data){
        data =Data;
        left=right=null;
    }
}
class PostOrder{
    static Node search(Node root){

        if (root!=null){

            search(root.left);
            search(root.right);

            System.out.print(root.data+" ");
        }
        return  null;
    }

    public static void main(String[] args) {


        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println("POST-Order :");
        search(root);
    }
}