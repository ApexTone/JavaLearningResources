package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("TableView");

        //Create column
        TableColumn<Product, String> nameCol = new TableColumn<>("Name");//Make a column for TableView
        nameCol.setMinWidth(200);
        nameCol.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));//Add data from "name" property to column. Must match exactly.

        TableColumn<Product, Double> priceCol = new TableColumn<>("Price");
        priceCol.setMinWidth(100);
        priceCol.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));

        TableColumn<Product, Integer> quantityCol = new TableColumn<>("Quantity");
        quantityCol.setMinWidth(100);
        quantityCol.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));

        TableView<Product> table = new TableView<>();
        table.setItems(getProduct());//set item to table
        table.getColumns().addAll(nameCol,priceCol,quantityCol);

        VBox layout = new VBox();
        layout.getChildren().addAll(table);
        Scene scene = new Scene(layout,600,300);
        window.setScene(scene);
        window.show();
    }

    //Create and add product
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop",1000,5));
        products.add(new Product("Bouncy ball",2.5,165));
        products.add(new Product("Notebook",99,45));
        products.add(new Product("DVD",999,20));
        products.add(new Product("Corn",1.45,8005));
        return  products;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
