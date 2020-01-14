public class Stack {
    private Node top;

    public Stack(){
    }
    public Stack(char data) {
        this.top = new Node(data);
        this.top.setNextNode(null);
    }

    public boolean isEmpty(){
        return top == null;
    }

    public char peek(){
        if(!isEmpty()){
            return top.getData();
        }
        else{
            return '0';
        }

    }
    public char pop(){
        if(!isEmpty()){
            Node temp = new Node();
            temp = top;
            top = top.getNextNode();
            return temp.getData();
        }
        else{
            return '0';
        }

    }
    public void popAll(){
        top = null;
    }
    public void push(char data){
        top = new Node(data,top);
    }
}
