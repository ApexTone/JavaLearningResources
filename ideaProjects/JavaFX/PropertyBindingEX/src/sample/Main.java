package sample;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.property.IntegerProperty;

public class Main extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Binding the property");

        //Input label
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        Label label1 = new Label("Welcome to my site: ");
        Label label2 = new Label();

        HBox bottomText = new HBox(label1,label2);
        bottomText.setAlignment(Pos.CENTER);
        VBox layout = new VBox(10,userInput, bottomText);

        layout.setAlignment(Pos.CENTER);

        label2.textProperty().bind(userInput.textProperty());//label2 will always change by the username

        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}