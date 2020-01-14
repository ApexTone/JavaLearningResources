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
    Button button= new Button("Click me");
    boolean answer;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Windows communication");

        StackPane layout = new StackPane();
        button.setOnAction(e->System.out.println(ConfirmationBox.display("Prompt","Send the data?")));
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300,300);

    window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
