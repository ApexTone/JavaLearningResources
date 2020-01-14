package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene;
    Button button = new Button("Submit");
    ComboBox<String> comboBox = new ComboBox<String>();//Combo box declaration
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;

        comboBox.getItems().addAll(//Adding choices
                "Halloween",
                "Blackhat",
                "Snowden",
                "Scream",
                "Saw",
                "Nightmare on the Elm street",
                "Texas chainsaw massacre"
        );
        comboBox.setPromptText("Your favorite movie?");//Grey-ish text
        comboBox.setEditable(true);//Allow for custom data input, but still be able to use normal data

        button.setOnAction(e->printMovie());
        comboBox.setOnAction(e-> System.out.println("User selected: " + comboBox.getValue()));//Need no listener! Easy to code than ChoiceBox

        VBox layout = new VBox(10);
        layout.getChildren().addAll(button,comboBox);

        scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    public void printMovie(){
        System.out.println(comboBox.getValue());//get selected value
    }

    public static void main(String[] args) {
        launch(args);
    }
}
