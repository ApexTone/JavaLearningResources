package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    Button button1,button2;//Declare button object
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Handle user event");

        button1 = new Button("Click me!");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("You clicked me, this is by anonymous inner class");
            }
        });//using anonymous inner class: Too long and looks dirty

        button2 = new Button("Don't click me!");
        //EventHandler interface has only 1 method, so it's ok to use lambda for this single method.
        button2.setOnAction(e -> {System.out.println("Y u clicked mei");
            System.out.println("No lisen do u");});//using lambda expression: Low readability but shorter

        StackPane layout = new StackPane();
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);

        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
