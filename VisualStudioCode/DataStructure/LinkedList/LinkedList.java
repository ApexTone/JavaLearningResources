/**
 * LinkedList
 */
public class LinkedList<T> {

    private Node<T> curr, head, prev, newNode;

    //Constructor
    public LinkedList() {
        head = null;
        curr = head;
        prev = null;
    }
    public LinkedList(T data) {
        head = new Node<T>(data);
        curr = head;
        prev = null;
    }

    //Push/pop
    public void push_front(T data) {//adding data to front of the list
        System.out.println("Adding node!: " + data);
        if (head == null) {
            newNode = new Node<T>(data);
        } else {
            newNode = new Node<T>(data, head);
        }
        head = newNode;
    }
    public void pop_front() {//deleting data from front of the list
        if (head != null) {
            System.out.println("Popping data!: " + head.getData());
            head = head.getNextNode();
        } else {
            System.out.println("The list is already empty!");
        }
    }
    public void pop_all() {//Pop all data
        while (head != null) {
            pop_front();
        }
    }

    public void insertData(T insertData,T afterData){//insertion in front of afterNode
        if(findNode(afterData)){//If found insertion area
            if(prev!=null){//If didn't find at head
                System.out.println("Insertion complete!");
                prev.setNextNode(new Node<T>(insertData,curr));
            }
            else{//If find at head
                System.out.println("Insert at head of list");
                head = new Node<T>(insertData,curr);
            }
        }
        else{
            if(head==null){//if list is empty
                System.out.println("No head! Insert at head of list");
                head = new Node<T>(insertData,curr);
            }
            else if(curr == null){//if end of list
                System.out.println("Can't find insertion node. Insert at end of list");
                prev.setNextNode(new Node<T>(insertData));
            }
        }

    }


    public void showData() {// Show entire list
        curr = head;
        if (head == null) {//If no data
            System.out.println("Wow! Such empty.");
        } else {
            while (curr != null) {//Loop until end
                System.out.print(curr.getData() + " ");
                curr = curr.getNextNode();
            }
            System.out.println("");
        }
    }


    public void deleteNode(T data) {// Essentially stop "pointing" to the deleted node
        if (findNode(data)) {//If found data
            if (prev == null) {// Delete head
                head = curr.getNextNode();
            } else {// Delete other node
                prev.setNextNode(curr.getNextNode());
            }
            System.out.println("Node deleted!: " + curr.getData());
        } else {
            System.out.println("No such data to delete");
        }
    }
    // Utility for this class
    private boolean findNode(T data) {// Finding data from head of list
        curr = head;
        prev = null;
        boolean found = false;
        while (curr != null) {
            if (curr.getData() == data) {
                System.out.println("Find data!: " + curr.getData());
                found = true;
                break;
            }
            prev = curr;
            curr = curr.getNextNode();
        }
        if (found == false) {
            System.out.println("No " + data + " in this linked list");
        }
        return found;
    }
}