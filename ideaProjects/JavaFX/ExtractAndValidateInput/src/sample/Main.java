package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Getting input & input validation");

        //Form
        TextField nameInput = new TextField();
        nameInput.setPromptText("Enter your age");
        Button button = new Button("Click this");
        button.setOnAction(e->{
            isInt(nameInput,nameInput.getText());
        });


        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(nameInput,button);

        //Scene
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    public boolean isInt(TextField source, String message){
        try{
           int age = Integer.parseInt(source.getText());
            System.out.println("User is: " + age);
            return true;
        }
        catch (NumberFormatException e){//If found error(not an integer)
            System.out.println("Error: "+ message.strip() + " is not a number");
            return false;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
