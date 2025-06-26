public class AVLTree {
    private Node Node;

    public AVLTree (){
        this.Node = null;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeigth();
    }

    public int getBalance(){
        return 0;
    }

    public void insert(int value){
        root = insertRec(Node, value);
    }

    private Node insertRec (Node node, int value){
        if (node == null) {
            Node newNode = new Node(value);
            newNode.setHeigth(1);
            return newNode;
        } 
        if (value < node.getValue()) {
            node.setLeft(insertRec(node, value));
        } else if (value > node.getValue()) {
            node.setRight(insertRec(node.getRight(), value));
        } else {
            return node;
        }

        
    }

}
