package main;
import Model.InHouse;
import Model.Product;
import Model.inventory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Folder containing Javadocs in InventoryManagement/Javadocs
/** Main class for Inventory Application.  Inventory Application provides an editable inventory table and list for Part and Product objects
 * @author Tajuddin AbdulGhani
 * @version 1.0
 * */
public class Main extends Application {
    /** Start method for main class.  Loads main page
     * FUTURE ENHANCEMENT: Add a relational database to store data
     * FUTURE ENHANCEMENT: Adding features to add/modify/delete in bulk
     * FUTURE ENHANCEMENT: Adding a feature to allow average daily manufacturing of a product*/
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/MainScreen.fxml"));
        primaryStage.setTitle("Tajuddin AbdulGhani - C482 - Inventory Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    /** main method for main class.  Loads sample data for inventory application */
    public static void main(String[] args) {
        InHouse part1 = new InHouse("Lugnut",6.00,10,5,30,001);
        inventory.addPart(part1);
        InHouse part2 = new InHouse("Screw",4.00,15,5,30,002);
        inventory.addPart(part2);
        InHouse part3 = new InHouse("Washer",2.00,20,5,30,003);
        inventory.addPart(part3);

        Product product1 = new Product("Drill bit",40.00,10,1,10);
        product1.addAssociatedPart(part2);
        inventory.addProduct(product1);

        launch(args);
    }
}