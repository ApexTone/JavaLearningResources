package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {//implement this interface to handle event
    public static void main(String[] args) {
        launch(args);
    }

    Button button1,button2;//Declare button object
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Handle user event");

        button1 = new Button("Click me!");
        button2 = new Button("Don't click me!");
        button1.setOnAction(this);//When the button is click, the code to handle is in "this" class
        button2.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);//It's overlapping button1 for now. Don't worry!

        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {//Generic for all event
        if(actionEvent.getSource() == button1){//Identify who did the action
            System.out.println("You did click me!");
        }
        else if(actionEvent.getSource() == button2){
            System.out.println("Why you clicked me!");
        }
    }
}
