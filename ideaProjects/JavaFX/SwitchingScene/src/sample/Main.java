package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1,scene2;
    Button button1,button2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;//Just for ease of use
        window.setTitle("Scene switching");

        Label label1 = new Label("First scene");//Plain text
        Label label2 = new Label("NANANANANANANANANA Second scene NANANANANANANANANA");

        button1 = new Button("Press for scene 2");
        button1.setOnAction(e->window.setScene(scene2));
        button2 = new Button("Press for scene 1");
        button2.setOnAction(e->window.setScene(scene1));

        VBox layout1 = new VBox(20);//VBox stack each obj on top of each other in column or row, spacing with int input
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,200,200);

        StackPane layout2 = new StackPane();//Stack everything in the middle on top of each other
        layout2.getChildren().addAll(label2,button2);
        scene2 = new Scene(layout2,300,300);

        window.setScene(scene1);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
