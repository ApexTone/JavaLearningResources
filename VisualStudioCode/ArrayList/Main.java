import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        demoArrayList6();
    }


    public static void demoArrayList1(){
        //Like dynamic array
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Juice","Orange",40));
        menus.add(new Drink("Juice","Coffee",40));
        menus.add(new Drink("Juice","Espresso",60));
        menus.add(new Drink("Soda","Cola",20));
        menus.add(new Drink("Meal","Steak",60));
        menus.add(new Drink("Meal","Mama",35));

        //Random access
        System.out.println(menus.get(3));

        //Loop for all items
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }

        Comparator<Drink> cmpPrice = new Comparator<Drink>(){//Overriding compare method
            @Override
            public int compare(Drink a1,Drink a2){
                //Ascending
                return a1.getPrice()-a2.getPrice();//>0 true, <0 false
                //Descending
                //return a2.getPrice()-a1.getPrice();
            }
        };
        Collections.sort(menus,cmpPrice);//Sort data

        /*
        //Can also use this way called "Anonymous class" as well
        Collections.sort(menus, new Comparator<Drink>(){//Overriding compare method
            @Override
            public int compare(Drink a1,Drink a2){
                return a1.getPrice()-a2.getPrice();//>0 true, <0 false
            }
        });
        */

        System.out.println("---------------------");
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }
    }

    public static void demoArrayList2() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Juice","Orange",40));
        menus.add(new Drink("Juice","Coffee",40));
        menus.add(new Drink("Juice","Espresso",60));
        menus.add(new Drink("Soda","Cola",20));
        menus.add(new Drink("Meal","Steak",60));
        menus.add(new Drink("Meal","Mama",35));
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }

        Collections.sort(menus, new Comparator<Drink>(){//Multiple condition sorting
            @Override
            public int compare(Drink a1,Drink a2){
                //return a1.getMenu().compareToIgnoreCase(a2.getMenu());//Sort string
                if(a1.getCategory().equalsIgnoreCase(a2.getCategory())){//If menus were in same category
                    return a1.getMenu().compareToIgnoreCase(a2.getMenu());//Sort by name
                }
                else{
                    return a1.getCategory().compareToIgnoreCase(a2.getCategory());//Sort by category
                }
            }
        });
        System.out.println("-----------------------");
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }
    }

    public static void demoArrayList3() {//Using class's natural ordering
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Juice","Orange",40));
        menus.add(new Drink("Juice","Coffee",40));
        menus.add(new Drink("Juice","Espresso",60));
        menus.add(new Drink("Soda","Cola",20));
        menus.add(new Drink("Meal","Steak",60));
        menus.add(new Drink("Meal","Mama",35));
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }

        Collections.sort(menus);//using implemented method for Drink class
        System.out.println("-----------------------");
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }
    }

    public static void demoArrayList4() {//JAVA8+ sortinh
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Juice","Orange",40));
        menus.add(new Drink("Juice","Coffee",40));
        menus.add(new Drink("Juice","Espresso",60));
        menus.add(new Drink("Soda","Cola",20));
        menus.add(new Drink("Meal","Steak",60));
        menus.add(new Drink("Meal","Mama",35));
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }

       // menus.sort(Comparator.comparing(Drink::getPrice).reversed());//using method reference
        menus.sort(Comparator.comparing(Drink::getPrice).thenComparing(Drink::getMenu).thenComparing(Drink::getCategory));//Chain sorting
        System.out.println("-----------------------");
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }
    }

    public static void demoArrayList5(){//Finding Item
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Kiwi");

        System.out.println(fruits.get(1));//Find item of index
        System.out.println(fruits.indexOf("Orange"));//return boolean if found or not
        System.out.println(fruits.contains("Kiwi"));

        fruits.add(1,"Coconut");//Insert before index 1
        System.out.println(fruits.toString());
        
        fruits.set(1, "Mango");//Overwrite value at index
        System.out.println(fruits.toString());
    }
    public static void demoArrayList6(){//custom class Item search
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("Juice","Orange",40));
        menus.add(new Drink("Juice","Coffee",40));
        menus.add(new Drink("Juice","Espresso",60));
        menus.add(new Drink("Soda","Cola",20));
        menus.add(new Drink("Meal","Steak",60));
        menus.add(new Drink("Meal","Mama",35));
        for(Drink menu:menus){
            System.out.println(menu.toString());
        }

        Drink search = new Drink("Juice","Orange",40);
        System.out.println(menus.contains(search));
    }
}