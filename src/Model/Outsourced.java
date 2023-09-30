package Model;

/**  Subclass for the Part class. */
public class Outsourced extends Part {
    private String companyName;
    /** Contructor.
     * @param companyName string detailed company name of an outsourced part
     * */
    public Outsourced(String name, double price, int stock, int min, int max, String companyName) {
        super(name, price, stock, min, max);
        this.companyName = companyName;
    }

    /** Setter for outsourced class*/
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /** Getter for outsourced class*/
    public String getCompanyName() {
        return companyName;
    }
}