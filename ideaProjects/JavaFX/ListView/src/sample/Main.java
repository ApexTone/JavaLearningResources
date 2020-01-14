package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene;
    Button button = new Button("Submit");
    ListView<String> listView = new ListView<String>();
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("List view for multiple selection");

        listView.getItems().addAll("Titanic", "Antman", "Deep impact", "Star wars");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);//For multiple selection

        button.setOnAction(e-> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,listView);

        scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked(){
        String message="";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();//Get all items selected in ObservableList form
        for(String m : movies){
            message += m+"      ";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
