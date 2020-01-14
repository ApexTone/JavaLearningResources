public class LinkedList {
    private Node head,prev,newNode,curr;

    //Constructor
    public LinkedList(int data){
        head = new Node(data, null);
        prev = null;
        newNode = null;
        curr = head;
    }
    public LinkedList(){
        head = null;
        prev = null;
        newNode = null;
        curr = head;
    }

    //Method
    public boolean isEmpty(){
        return head == null;
    }
    public void addNode(int data){//FIX THIS
        if(head == null){
            head = new Node(data,null);
        }
        else{
            curr = head;
            while(curr != null){
                if(curr.getNextNode() == null){
                    curr.setNextNode(new Node(data));
                    break;
                }
                else{
                    curr = curr.getNextNode();
                }
            }
        }
    }

    public void showList(){
        if(isEmpty()){
            System.out.println("Linked list is already empty!");
        }
        else {
            curr = head;
            System.out.print("[");
            while (curr != null) {
                System.out.print(curr.getData());
                curr = curr.getNextNode();
                if (curr != null) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    private Node searchData(int query){
        curr = head;
        while(curr != null){
            if(curr.getData() == query){
                break;
            }
            else{
                curr = curr.getNextNode();
            }
        }

        return curr;
    }

    public void insertNode(int data, int prevData){

    }
    public void eraseNode(int data){

    }
}
