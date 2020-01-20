package sample;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.beans.property.IntegerProperty;

public class Main extends Application {
    Stage window;
    Button button = new Button("Click");
    int i=0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Binding: Kinda like Excel cell references");

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x.multiply(10));// y will always equal to x*10

        button.setOnAction(e->{
            x.setValue(x.getValue()+1);
            System.out.println("X: " + x.getValue());
            System.out.println("Y: " + y.getValue());
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}