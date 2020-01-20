package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Menu bar");

        //Individual menu root
        //File
        Menu fileMenu = new Menu("File");//Create Menu obj that will show "File" as name
        //Menu items: node in menu root
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e-> System.out.println("Create new file"));
        MenuItem openFile = new MenuItem("Open...");
        openFile.setOnAction(e-> System.out.println("Open file"));
        MenuItem saveFile = new MenuItem("Save...");
        saveFile.setOnAction(e-> System.out.println("Save file"));
        MenuItem settingFile = new MenuItem("Setting...");
        settingFile.setOnAction(e-> System.out.println("Setting this file"));
        MenuItem exitFile = new MenuItem("Exit");
        exitFile.setOnAction(e-> window.close());
        //Adding item
        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(openFile);
        fileMenu.getItems().add(saveFile);
        fileMenu.getItems().add(new SeparatorMenuItem());//Add separation with line
        fileMenu.getItems().add(settingFile);
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(exitFile);

        //Edit
        Menu editMenu = new Menu("_Edit");//Adding _ in front of character will make it become hotkey
        MenuItem copyEdit= new MenuItem("Copy"),pasteEdit = new MenuItem("Paste");
        copyEdit.setOnAction(e-> System.out.println("Copied"));
        pasteEdit.setOnAction(e-> System.out.println("Pasted"));
        pasteEdit.setDisable(true);//Disabled action on this MenuItem
        editMenu.getItems().addAll(copyEdit,pasteEdit);

        //CheckMenuItem: Help
        Menu helpMenu = new Menu("Hel_p");
        CheckMenuItem showLines = new CheckMenuItem("Show line numbers");//This kind can be toggle on and off
        showLines.setSelected(true);//Make selected by default
        showLines.setOnAction(e->{
            if(showLines.isSelected()){//if toggled on
                System.out.println("Now showing line numbers");
            }
            else{
                System.out.println("No line numbers from now on");
            }
        });
        helpMenu.getItems().addAll(showLines);

        //RadioMenu: Only 1 selection at a time. Difficulty
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();//Items in group can only be selected 1 at a time
        RadioMenuItem easy = new RadioMenuItem("Easy");
        easy.setOnAction(e-> System.out.println("Easy mode"));
        RadioMenuItem medium = new RadioMenuItem("Medium");
        medium.setOnAction(e-> System.out.println("Medium mode"));
        RadioMenuItem hard = new RadioMenuItem("Hard");
        hard.setOnAction(e-> System.out.println("Hard mode"));
        //Set toggle group
        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);
        difficultyMenu.getItems().addAll(easy,medium,hard);


        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu,difficultyMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
