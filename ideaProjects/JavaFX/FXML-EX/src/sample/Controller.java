package sample;

import javafx.scene.control.Button;

public class Controller {//For back-end jobs: Handle interaction from fxml
    public Button button,anotherButton;

    public void handleButtonClick(){
        System.out.println("Clicked!");
    }

    public void anotherButtonClick(){
        System.out.println("Another one");
        anotherButton.setText("Stop touching me!");
    }
}
