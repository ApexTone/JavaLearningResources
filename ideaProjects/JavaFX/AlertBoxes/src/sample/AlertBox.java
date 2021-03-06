package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void display(String title, String message){
        Stage window = new Stage();//Create blank window
        window.setTitle(title);
        window.setMinWidth(250);//Window can't be resize below this value
        window.initModality(Modality.APPLICATION_MODAL);//Block input before this window

        Label label = new Label(message);
        Button button = new Button("Close button");
        button.setOnAction(e->window.close());//Command for closing window

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);//Set center layout for VBox
        Scene scene = new Scene(layout,250,100);

        window.setScene(scene);
        window.showAndWait();//Block input before this window
    }
}
