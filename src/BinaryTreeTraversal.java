public class BinarySearchTree {
    public static void inorder (Node root){ // Each child of a tree is a root of its subtree.
        if (root.left != null){
            inorder(root.left);
        }
        System.out.println(root.key);
        if (root.right != null){
            inorder(root.right);
        }
    }

    public static void preorder (Node root){ // Each child of a tree is a root of its subtree.
        System.out.println(root.key);

        if (root.left != null){
            inorder(root.left);
        }
        if (root.right != null){
            inorder(root.right);
        }
    }

    public static void postorder (Node root){ // Each child of a tree is a root of its subtree.
        if (root.left != null){
            inorder(root.left);
        }
        if (root.right != null){
            inorder(root.right);
        }
        System.out.println(root.key);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);


        System.out.println("\n In Order Traversal");
        inorder(tree.root);

        System.out.println("\n Pre-order Traversal");
        preorder(tree.root);


        System.out.println("\n Post-order Traversal");
        postorder(tree.root);

    }
}
