package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmationBox {
    static boolean answer;

    public static boolean display(String title, String message){
        answer=false;

        Stage window = new Stage();//Create blank window
        window.setTitle(title);
        window.setMinWidth(250);//Window can't be resize below this value
        window.initModality(Modality.APPLICATION_MODAL);//Block input before this window

        Label label = new Label(message);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        yesButton.setOnAction(e->{answer=true; window.close();});
        noButton.setOnAction(e->{answer=false; window.close();});

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesButton,noButton);
        layout.setAlignment(Pos.CENTER);//Set center layout for VBox
        Scene scene = new Scene(layout,250,100);

        window.setScene(scene);
        window.showAndWait();//Block input before this window
        return answer;
    }
}

