package Model;

import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/** Alert class creates dialog box for parts and product for any data input issues */

public class AlertMessages {
    /** Controls Alert boxes for data validation.
     * Controls alert boxes for data validation for part and product fields.
     * @param code Int value for the switch method to select an error message for the dialog box
     * */
    public static void partErrors (int code) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error saving Item");
        alert.setHeaderText("Unable save Item");
        switch (code) {
            case 1: {
                alert.setContentText("The NAME cannot be empty.");
                break;
            }
            case 2: {
                alert.setContentText("The inventory count must be between the min and the max.");
                break;
            }
            case 3: {
                alert.setContentText("The Max value must be more than the min.");

                break;
            }
            case 4: {
                alert.setContentText("The min and max should have value greater than 0.");
                break;
            }
            case 5: {
                alert.setContentText("The Machine ID/ Company Name cannot be empty.");
                break;
            }
            case 6: {
                alert.setContentText("Please select InHouse or Outsourced.");
                break;
            }
            case 7: {
                alert.setContentText("The machine ID must have int and  greater than 0");
                break;
            }
            case 8: {
                alert.setContentText("The price must be greater than the cost of the combined associated parts");
                break;
            }

        }
        alert.showAndWait();

    }

    /** Highlights fields passed via a parameter.
     * Highlights a field passed via a parameter, used with data validation for the parts and product fields
     * @param field A 'Textfield' passed from parts or product fields*/
    public static void highlightErrorField (TextField field) {
        field.setStyle("-fx-border-color: red");
    }

    /** Highlights radio buttons passed via a parameter.
     * Highlights a radio button passed via a parameter, used with data validation for the parts radio buttons
     * @param field A RadioButton Field passed from parts radiobutton fields
     * */
    public static void highlightErrorField (RadioButton field) {
        field.setStyle("-fx-border-color: red");
    }
    /** Resets all the highlighted fields from the Part controllers.
     * Rests all the fields set to highlight from the highLightErrorField methods in the Part controllers
     * @param inHouse In House Radio button field from the Parts addParts and ModifyParts controller
     * @param outsourced Outsourced Radio button field from the Parts addParts and ModifyParts controller
     * @param name name field used from the Parts add and modify controller
     * @param inv inv field used from the Parts add and modify controller
     * @param price price field used from the Parts add and modify controller
     * @param max max field used from the Parts add and modify controller
     * @param min min field used from the Parts add and modify controller
     * @param machineID machineID and Company name field used from the Parts add and modify controllers
     * */

    public static void resetErrorFieldPart(RadioButton inHouse, RadioButton outsourced, TextField name, TextField inv, TextField price, TextField max, TextField min, TextField machineID) {
        inHouse.setStyle("-fx-border-color: inherit");
        outsourced.setStyle("-fx-border-color: inherit");
        name.setStyle("-fx-border-color: inherit");
        inv.setStyle("-fx-border-color: inherit");
        price.setStyle("-fx-border-color: inherit");
        max.setStyle("-fx-border-color: inherit");
        min.setStyle("-fx-border-color: inherit");
        machineID.setStyle("-fx-border-color: inherit");
    }

    /** Resets all the highlighted fields from the Product controllers.
     * Rests all the fields set to highlight from the highLightErrorField methods in the Product controllers
     * @param name name field used from the Product add and modify controller
     * @param inv inv field used from the Product add and modify controller
     * @param price price field used from the Product add and modify controller
     * @param max max field used from the Product add and modify controller
     * @param min min field used from the Product add and modify controller
     * */

    public static void resetErrorFieldProduct (TextField name, TextField inv, TextField price, TextField max, TextField min) {
        name.setStyle("-fx-border-color: inherit");
        inv.setStyle("-fx-border-color: inherit");
        price.setStyle("-fx-border-color: inherit");
        max.setStyle("-fx-border-color: inherit");
        min.setStyle("-fx-border-color: inherit");
    }
}