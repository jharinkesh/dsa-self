
public class BInaryTree {

    public static void main(String[] args) {
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        four.left = five;
        four.right = six;

        five.left = seven;
        five.right = eight;

        six.left = nine;
        six.right = ten;

//        inorder(four);
        preorder(four);
        System.out.println();
        postorder(four);
    }

    static void inorder(Node root){
        if(root !=null){
            inorder(root.left);
            System.out.print(root.key +" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if(root !=null){
            System.out.print(root.key +" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root){
        if(root !=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key +" ");
        }
    }

}

class Node {
    int key;
    Node left, right;
    Node(int key){
        this.key = key;
    }
}
