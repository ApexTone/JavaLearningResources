package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Combining layouts");

        HBox topBar = new HBox(10);//Horizontal box
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        topBar.getChildren().addAll(button1,button2,button3);

        VBox leftBar = new VBox(10);//Vertical box
        Button button4 = new Button("A");
        Button button5 = new Button("B");
        Button button6 = new Button("C");
        leftBar.getChildren().addAll(button4,button5,button6);

        BorderPane borderPane = new BorderPane();//Combining multiple layouts into one
        borderPane.setTop(topBar);
        borderPane.setLeft(leftBar);

        Scene scene = new Scene(borderPane,300,300);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
