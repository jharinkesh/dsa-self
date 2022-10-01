package main.java.tree;

public class BST {

    static class Node{
        int key;
        Node left, right;
        Node(int key){
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(null, 7);
        root = insert(root, 2);
        root = insert(root, 5);
        root = insert(root, 1);
        inorder(root);
    }

    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+ " ");
            inorder(root.right);
        }
    }

    static Node insert(Node root, int key){
        if(root == null)
            root = new Node(key);
        else{
            Node x = root, p = null;
            while(x!=null){
                p = x;
                if(key<root.key)
                    x = x.left;
                else
                    x = x.right;
            }
            if(key<p.key)
                p.left = new Node(key);
            else
                p.right = new Node(key);
        }
        return root;
    }
}


