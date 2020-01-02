public class Main {
    public static void main(String[] args) {
        demo2();
    }
    public static void demo1(){
        Node test = new Node('c');
        Node testNext = new Node('d');
        test.setNextNode(testNext);


        Stack aStack = new Stack('a');
        aStack.push('s');
        for(int i=50;i<80;i++){
            aStack.push((char)(i));
        }
        while(!aStack.isEmpty()){
            System.out.println(aStack.pop());
        }
    }
    public static void demo2(){
        StackCalculation aStack = new StackCalculation();
        aStack.infixToPostfix("a+(b-c*d)/e");
        System.out.println(aStack.getPostfix());
        System.out.println(aStack.getInfix());
    }
}
