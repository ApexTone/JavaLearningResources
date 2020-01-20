package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);//Set vertical spacing
        grid.setHgap(10);//Set horizontal spacing

        Label name = new Label("Username: ");
        name.setId("bold-label");//Set new ID for this obj

        GridPane.setConstraints(name, 0,0);
        TextField nameInput = new TextField("Username");
        GridPane.setConstraints(nameInput,1,0);
        name.setStyle("-fx-text-fill: #006600");//Set style for individual obj

        Label password = new Label("Password: ");
        GridPane.setConstraints(password, 0, 1);
        PasswordField passwordInput = new PasswordField();//PasswordField make input become "."
        passwordInput.setPromptText("Password");
        GridPane.setConstraints(passwordInput, 1,1);

        loginButton = new Button("Login");
        GridPane.setConstraints(loginButton,1,2);
        loginButton.setOnAction(e->{
            setUserAgentStylesheet(STYLESHEET_CASPIAN);//Set new style for window (This is a default style)
        });

        Button signUp = new Button("Sign up");
        signUp.getStyleClass().add("button-blue");//Set style class for this specific button
        GridPane.setConstraints(signUp,1,3);

        grid.getChildren().addAll(name,nameInput,password,passwordInput,loginButton,signUp);

        Scene scene = new Scene(grid,300,300);
        scene.getStylesheets().addAll("CssTheme.css");//Set new style for this scene
        window.setScene(scene);
        window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
