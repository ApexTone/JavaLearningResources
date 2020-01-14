public class Hello {
    public static void main(String[] args) {
        String str="Hello World";
        //System.out.println(str.toUpperCase());
        addExclamation(str);    
        String exc=addExclamationWithReturn(str);
        System.out.println(exc);


        //Class from other file
        BoxV1 aBox = new BoxV1();
        aBox.d=5;
        aBox.w=7;
        aBox.h=60;
        System.out.println(aBox.volumn());
        System.out.println(aBox.surface());

        BoxV2 bBox=new BoxV2(90,60,30);
        //bBox.setDimension(20, 30, 40);
        System.out.println(bBox.volumn());
        System.out.println(bBox.surface());
        if(bBox.getDimension(1)>=100){
            System.out.println("Extra large box");
        }
        else{
            System.out.println("Normal box");
        }

        System.out.println(bBox);//Will use toString() by default
        //System.out.println(bBox.toString());
    }


    //Class in same file
    public static void addExclamation(String s){
        System.out.println(s+'!');
    }
    public static String addExclamationWithReturn(String s){
        return s+'!';
    }
    
}