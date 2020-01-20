package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button button = new Button("Click");
    int i=0;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Properties");

        Person p = new Person();
        p.firstNameProperty().addListener((v,oldValue,newValue)->{
            System.out.println(p.firstNameProperty());
            System.out.println(p.getFirstName());
        });

        button.setOnAction(e->{
            p.setFirstName("porky"+(i++));
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
