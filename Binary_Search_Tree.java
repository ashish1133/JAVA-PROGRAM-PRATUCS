class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}

public class Binary_Search_Tree {

    static Node search(Node root,int key){
        if (root.key==key)
            return root;

        if (root.key<key)
            return root.right;

        return root.left;
    }

    public static void main(String[] args) {

        Node root= new Node(5);
        root.left = new Node(3);
        root.right= new Node(7);
        root.left.left = new Node(2);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(8);

        System.out.println(search(root,3)!=null?"Found the Node":"Not found the Node");
        System.out.println(search(root,8)!=null?"Found the Node":"Not found the Node");
    }
}
