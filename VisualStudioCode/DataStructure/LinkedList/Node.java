public class Node {
    private Node nextNode;///point to next node
    private int data;//store data

    //Constructor
    public Node(){
        this.nextNode=null;
    }
    public Node(int data){
        this.data=data;
        this.nextNode=null;
    }
    public Node(int data,Node nextNode){
        this.data=data;
        this.nextNode=nextNode;
    }

    //Getters
    public int getData() {
        return data;
    }
    public Node getNextNode() {
        return nextNode;
    }

    //Setters
    public void setData(int data) {
        this.data = data;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}