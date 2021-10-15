/**
 * @author Karl Jarvis 
 * X18381071
 * 12/08/2021
 */
package schooltourapp;

public class BusTours extends Tours {
    
    //Declare variables
    private String pickUpPoint;
    private String dropOffPoint;
    private String busComapny;

    //Constructor
    public BusTours(String pickUpPoint, String dropOffPoint, String busComapny, String destination, int year, String tName, String cGroup, String tourId) {
        super(destination, year, tName, cGroup, tourId);
        this.destination = destination;
        this.year = year;
        this.tName = tName;
        this.cGroup = cGroup;
        this.pickUpPoint = pickUpPoint;
        this.dropOffPoint = dropOffPoint;
        this.busComapny = busComapny;
    }

    //Getters and Setters
    public String getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(String pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public String getDropOffPoint() {
        return dropOffPoint;
    }

    public void setDropOffPoint(String dropOffPoint) {
        this.dropOffPoint = dropOffPoint;
    }

    public String getBusComapny() {
        return busComapny;
    }

    public void setBusComapny(String busComapny) {
        this.busComapny = busComapny;
    }
    
    //toString method
    @Override
    public String toString() {
        super.toString();
        return "BusTours{" + "pickUpPoint=" + pickUpPoint + ", dropOffPoint=" + dropOffPoint + ", busComapny=" + busComapny + '}';
    }
    
    
    
    
    
    
    

    
}
