public class StackCalculation {
    private Stack aStack;
    private String infix,postfix;

    //Constructor
    public StackCalculation(){
        aStack = new Stack();
        postfix="";
        infix="";
    }

    //Getter
    public String getInfix() {
        return infix;
    }
    public String getPostfix() {
        return postfix;
    }

    //Method
    public void infixToPostfix(String infix){
        this.infix=infix;
        postfix="";
        for(int i=0;i<infix.length();i++){
            char temp=infix.charAt(i);
            //System.out.println(aStack.peek());
            if(temp=='+' || temp=='-' || temp=='*' || temp=='/' || temp=='%' || temp=='('){//Operand and (
                aStack.push(temp);
            }
            else if(temp==')'){
                while(aStack.peek()!='('){//Pop all until (
                    postfix=postfix+aStack.pop();
                }
                aStack.pop();
            }
            else{//Alphabet(Operand)
                postfix=postfix+temp;
            }
            //System.out.println(postfix);
        }

        while(!aStack.isEmpty()){//Pop all remaining
            postfix=postfix+aStack.pop();
            //System.out.println(postfix);
        }
    }

}
