public class Node <T>{
    private Node<T> nextNode;///point to next node
    private T data;//store data

    //Constructor
    public Node(){
        this.nextNode=null;
    }
    public Node(T data){
        this.data=data;
        this.nextNode=null;
    }
    public Node(T data,Node<T> nextNode){
        this.data=data;
        this.nextNode=nextNode;
    }

    //Getters
    public T getData() {
        return data;
    }
    public Node<T> getNextNode() {
        return nextNode;
    }

    //Setters
    public void setData(T data) {
        this.data = data;
    }
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}