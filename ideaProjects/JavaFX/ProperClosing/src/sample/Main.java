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
    Button exit = new Button("Exit game");
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;

        //Useful for doing something when closing the app such as save data, free data, etc.
        window.setOnCloseRequest(e->{
            e.consume();//This line nullify the closing request when hit 'x' on bar
            closeProgram();
        });//When hit 'x' on bar, it will do the event then close the program instantly
        exit.setOnAction(e->closeProgram());//When button is press

        StackPane layout = new StackPane();
        layout.getChildren().addAll(exit);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){//Closing window function
        Boolean answer = ConfirmationBox.display("Close prompt","Do you want to close?");
        if(answer){
            System.out.println("File saved");
            window.close();//Close window
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
