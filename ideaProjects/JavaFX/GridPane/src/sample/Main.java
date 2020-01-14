package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button loginButton;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("GridPane");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));//LEARN ABOUT INSETS
        grid.setVgap(8);//Set vertical spacing
        grid.setHgap(10);//Set horizontal spacing

        Label name = new Label("Username: ");
        GridPane.setConstraints(name, 0,0);//Add name var to respective col,row
        TextField nameInput = new TextField("Username");//text input field that has default input
        GridPane.setConstraints(nameInput,1,0);

        Label password = new Label("Password: ");
        GridPane.setConstraints(password, 0, 1);
        TextField passwordInput = new TextField();//No default input but...
        passwordInput.setPromptText("Password");//Has the grey bg text that disappear when clicked
        GridPane.setConstraints(passwordInput, 1,1);

        loginButton = new Button("Login");
        loginButton.setOnAction(e-> System.out.println("Logged in"));
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(name,nameInput,password,passwordInput,loginButton);//Assign position to grid obj

        Scene scene = new Scene(grid,300,300);
        window.setScene(scene);
        window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
