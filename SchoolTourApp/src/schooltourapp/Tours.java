/**
 * @author Karl Jarvis 
 * X18381071
 * 12/08/2021
 */
package schooltourapp;

public class Tours {
    
    //Declare variables   
    public String destination;
    public int year;
    public String tName;
    public String cGroup;
    public String tourId;

    
    //Constructor
    public Tours(String destination, int year, String tName, String cGroup, String tourId) {
        this.destination = destination;
        this.year = year;
        this.tName = tName;
        this.cGroup = cGroup;
        this.tourId = tourId;
    }
    
     //Getters and Setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getcGroup() {
        return cGroup;
    }

    public void setcGroup(String cGroup) {
        this.cGroup = cGroup;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {    
        this.tourId = tourId;
    }

    //toString method

    @Override
    public String toString() {
        return "Tours{" + "destination=" + destination + ", year=" + year + ", tName=" + tName + ", cGroup=" + cGroup + ", tourId=" + tourId + '}';
    }
    
    


    


    
}
