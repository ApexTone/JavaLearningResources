import java.util.Objects;

public class Drink implements Comparable<Drink>{//Comparable is an interface

    private String menu,category;
    private int price;
    public Drink(String category,String menu,int price){
        setCategory(category);
        setMenu(menu);
        setPrice(price);
    }
    public Drink(){
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public String getCategory() {
        return category;
    }
    public String getMenu() {
        return menu;
    }
    public int getPrice() {
        return price;
    }


    @Override
    public int compareTo(Drink o) {//Class's natural ordering
        if(this.getCategory().equalsIgnoreCase(o.getCategory())){
            return this.getMenu().compareToIgnoreCase(o.getMenu());
        }
        else{
            return this.getCategory().compareToIgnoreCase(o.getCategory());
        }
    }

    @Override
    public String toString(){
        return menu + " " + category + " " + price;
    }

    @Override//Override equals for value searching
    public boolean equals(Object o) {
        if (this == o) return true;//Memory address check
        if (o == null || getClass() != o.getClass()) return false;//same class / null
        Drink drink = (Drink) o;
        return price == drink.price &&
                menu.equalsIgnoreCase(drink.menu) &&
                category.equalsIgnoreCase(drink.category);
    }

    @Override
    public int hashCode() {//Override hash code for value searching
        return Objects.hash(menu, category, price);
    }

}