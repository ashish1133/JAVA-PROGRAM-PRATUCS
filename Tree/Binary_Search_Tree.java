package Tree;

class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left = right = null;
    }
}
class BST{
    static Node search(Node root,int key){

        while (root!=null){
            if (key>root.key){
                root=root.right;
            }
            else if(key<root.key){
                root=root.left ;
            }
            else {
                return root;
            }
        }
        return null;
    }
    // Driver Code
    public static void main(String[] args) {

        // Creating a hardcoded tree for keeping
        // the length of the code small. We need
        // to make sure that Tree.BST properties are
        // maintained if we try some other cases.
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println(search(root, 19) != null ?
                "Found" : "Not Found");
        System.out.println(search(root, 80) != null ?
                "Found" : "Not Found");
    }

}