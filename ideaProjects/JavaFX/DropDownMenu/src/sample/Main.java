package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

public class Main extends Application {
    Stage window;
    Button button=new Button("Click me");
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Check box");

        //Create drop down box
        ChoiceBox<String> dropDown = new ChoiceBox<String>();
        dropDown.getItems().addAll("Apple","Banana","Orange"); //Get all item in ObservableList obj
        dropDown.setValue("Apple");//Set default value, not just blank. Note that the value must exist in list first.

        button.setOnAction(e->getChoice(dropDown));

        //Listen for selection changes in ChoiceBox
        dropDown.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)-> System.out.println("New item has been selected: "+newValue));//Add a listener. When selection change, trigger the event.


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,dropDown);

        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    private void getChoice(ChoiceBox<String> dropDown){
        String food = dropDown.getValue();//Get current value
        System.out.println(food);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
