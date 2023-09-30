module InventoryManagement {
    requires javafx.fxml;
    requires javafx.controls;

    opens main;
    opens Controller;
    opens Model;
    opens View;
}