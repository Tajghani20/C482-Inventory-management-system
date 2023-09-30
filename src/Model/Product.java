package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**Product class for product objects used in inventory application*/
public class Product {

    public static int generatedId = 0;

    private ObservableList<Part> associatedParts = FXCollections.observableArrayList();

    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    /** Constructor for the product class. */
    public Product(String name, double price, int stock, int min, int max) {
        this.id = ++generatedId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    /** Setter for the product class.*/
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }


    /** Getter for the product class.*/
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    /**Adds a part to the associated part array.
     * @param part part object used as a parameter for inclusion into the associatedparts array
     * */
    public void addAssociatedPart(Part part) {
        associatedParts.add(part);
    }

    /**deletes a part from the associated part array.
     * @param selectedAssociatedPart part object used as a parameter for deletion from the associated parts array
     * @return returns a boolean true or false based on successful deletion or failure
     * */
    public boolean deleteAssociatedPart(Part selectedAssociatedPart) {
        return associatedParts.remove(selectedAssociatedPart);
    }

    /**returns the associatedparts array object
     * @return returns the associatesparts array object
     * */
    public ObservableList<Part> getAllAssociatedParts() {
        return associatedParts;
    }

}