package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    TableView<Product> table;
    TextField nameInput,priceInput,quantityInput;
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

        table = new TableView<>();
        table.setItems(getProduct());//set item to table
        table.getColumns().addAll(nameCol,priceCol,quantityCol);

        //Editing table: Input field
        nameInput = new TextField();
        nameInput.setPromptText("Name of product");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("Price of product");
        priceInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity of product");
        quantityInput.setMinWidth(100);

        //Button
        Button addButton = new Button("Add"),deleteButton = new Button("Delete");
        addButton.setOnAction(e->addButtonClicked());
        deleteButton.setOnAction(e->deleteButtonClicked());


        //For button area
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);

        VBox layout = new VBox();
        layout.getChildren().addAll(table,hBox);
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

    //Button event
    public void addButtonClicked(){//Take input value then add row
        Product product = new Product();
        product.setName(nameInput.getText());//Get string from input field
        product.setPrice(Double.parseDouble(priceInput.getText()));//Convert string to double
        product.setQuantity(Integer.parseInt(quantityInput.getText()));//Convert string to int

        table.getItems().add(product);//Add to table

        //Clear input field
        nameInput.clear();
        quantityInput.clear();
        priceInput.clear();
    }
    public void deleteButtonClicked(){
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();//All items in table
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);//Remove all selected product from item
    }

    public static void main(String[] args) {
        launch(args);
    }
}
