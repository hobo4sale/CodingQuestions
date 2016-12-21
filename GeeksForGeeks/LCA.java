class Node {
    int data;
    Node left;
    Node right;

    Public Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class Binary Tree {
    Node root;

    private Node findLCA(int one, int two) {
        return findLCA(root, one, two);
    }

    private Node findLCA(Node node, int one, int two) {
        if (node == null) {
            return null;
        }   

        Node leftLCA = findLCA(node.left, one, two);
        Node rightLCA = findLCA(node.right, one, two);

        if(leftLCA != null && rightLCA != null) {
            return node;
        }
        else {
            if(leftLCA == null) {
                return rightLCA;
            }
            else {
                return leftLCA;
            }
        }
    }
