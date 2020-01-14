package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button button1= new Button("I'm here! CLICK ME!");;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Alert boxes/Pop-up windows");

        button1.setOnAction(e ->{System.out.println("New WINDOW!"); AlertBox.display("New Alert Box!/popup","NANANA");});

        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(button1);
        Scene scene1 = new Scene(layout1,300,300);

        window.setScene(scene1);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
