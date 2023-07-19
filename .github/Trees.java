// Node class for a binary tree
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Binary Tree operations
class BinaryTree {
    Node root;

    // Tree traversal (In-order)
    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }
}

// Usage
BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
tree.inOrderTraversal(tree.root);

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        }
        return node;
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }
}
