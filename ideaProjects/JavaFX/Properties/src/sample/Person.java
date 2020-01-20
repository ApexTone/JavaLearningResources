package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    //Note that StringProperty is abstract class
    //(obj,name,def value)
    private StringProperty firstName = new SimpleStringProperty(this,"firstName","");//You can listen to the change of value here

    //Return StringProperty: Can be used to add listener
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //Return value of firstName
    public String getFirstName() {
        return firstName.get();
    }
    //Set value to firstName
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
