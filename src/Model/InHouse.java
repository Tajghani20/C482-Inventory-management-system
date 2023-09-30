package Model;

/**  Subclass for the Part class.*/
public class InHouse extends Part{
    private int machineID;
    /** Contructor for class.
     * @param machineID int detailed machine ID of an in house part
     * */
    public InHouse(String name, double price, int stock, int min, int max, int machineID) {
        super(name, price, stock, min, max);
        this.machineID = machineID;
    }
    /** setter */
    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
    /** getter */
    public int getMachineID() {
        return machineID;
    }
}