package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button button = new Button("Order now!");

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Check box");

        //Check box
        CheckBox box1 = new CheckBox("Bacon");//Create a check box
        CheckBox box2 = new CheckBox("Tuna");
        box1.setSelected(true);//Check the box by default


        button.setOnAction(e->handleOption(box1,box2));


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(box1,box2,button);

        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    //Handle checkbox option
    public static void handleOption(CheckBox box1, CheckBox box2){
        String message = "User order:";

        if(box1.isSelected()){//If the box is selected
            message += "Bacon ";
        }
        if(box2.isSelected()){
            message += "Tuna ";
        }

        if(message.equals("User order:")){
            System.out.println("Nothing order");
        }
        else {
            System.out.println(message);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
