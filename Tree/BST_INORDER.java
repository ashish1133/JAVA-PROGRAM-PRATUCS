package Tree;

class node{
    int key;
    Node left,right;
    public node(int item){
        key=item;
        left=right=null;
    }
}
class BST_INORDER {
    public static void InOrder(Node root){
                if (root == null)
                    return;

            InOrder(root.left);
            System.out.print(root.key+" ");
            InOrder(root.right);
        }
    }

class m{
    public static void main(String[] args) {

        Node root = new Node(5);
        root.left  = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        BST_INORDER.InOrder(root);


    }
}
