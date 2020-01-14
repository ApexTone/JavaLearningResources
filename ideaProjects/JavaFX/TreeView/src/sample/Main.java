package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene;
    Button button = new Button("Submit");
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("List view for multiple selection");

        button.setOnAction(e-> System.out.println(""));

        TreeItem<String> root,school,art;//For each tree node
        root = new TreeItem<String>();//Root node
        root.setExpanded(true);//Make this node expanded by default

        school = makeBranch("School",root);//set this node to parent node
        makeBranch("MP5",school);
        makeBranch("Pencil",school);

        art = makeBranch("Art",root);//set this node to parent node
        makeBranch("Brush",art);
        makeBranch("Palette",art);


        //Create tree
        TreeView<String> tree = new TreeView<String>(root);//Create tree with root node as root
        tree.setShowRoot(false);//Skip showing root node
        tree.getSelectionModel().selectedItemProperty().addListener((v,oleValue,newValue)->{
            if(newValue!=null){
                System.out.println(newValue.getValue());
            }
        });//Add listener to all input


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(tree);

        scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeBranch(String nodeName, TreeItem<String> parentNode){
        TreeItem<String> item = new TreeItem<String>(nodeName);
        item.setExpanded(true);
        parentNode.getChildren().add(item);//add node to parent node
        return item;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
