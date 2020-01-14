package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Stage = window
        //Scene = items in stage
        primaryStage.setTitle("Stage(window) title");//Set window name

        Button button = new Button("A button");//Set button

        StackPane layout = new StackPane();
        layout.getChildren().add(button);//Add button to StackPane

        Scene scene = new Scene(layout, 500,200);//Window size with layout
        primaryStage.setScene(scene);
        primaryStage.show();//Display
    }


    public static void main(String[] args) {
        launch(args);
    }
}
