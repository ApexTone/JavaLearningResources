public class Node {
    private int data;
    private Node nextNode;

    //Constructor
    public Node(){
        this.data = 0;
        this.nextNode=null;
    }
    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }
    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    //Getters/Setters
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
