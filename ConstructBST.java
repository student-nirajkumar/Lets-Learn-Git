public class ConstructBST {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;
    public ConstructBST() {
        root = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node current = root, parent = null;
            while (true) {
                parent = current;
                if (data < current.data) { 
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else { 
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public Node minNode(Node root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }
    public Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        } else {
            if (value < node.data) {
                node.left = deleteNode(node.left, value);
            } else if (value > node.data) {
                node.right = deleteNode(node.right, value);
            } else {
                if (node.left == null && node.right == null) { 
                    node = null;
                } else if (node.right == null) { 
                    node = node.left;
                } else { 
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }
    public void inorderTraversal(Node node) {
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        } else {
            if (node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inorderTraversal(node.right);
        }
    }
    public boolean search(Node node, int value) {
        if (node == null) {
            return false; 
        } else if (node.data == value) {
            return true; 
        } else if (value < node.data) {
            return search(node.left, value); 
        } else {
            return search(node.right, value); 
        }
    }

    public static void main(String[] args) {
        ConstructBST bt = new ConstructBST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);

        System.out.println("Binary Search Tree after insertion:");
        bt.inorderTraversal(bt.root);
        int searchValue = 70;
        if (bt.search(bt.root, searchValue)) {
            System.out.println("\nNode " + searchValue + " found in the tree.");
        } else {
            System.out.println("\nNode " + searchValue + " not found in the tree.");
        }

        bt.deleteNode(bt.root, 50);
        System.out.println("\nBinary Search Tree after deleting node 50:");
        bt.inorderTraversal(bt.root);
    }
}
