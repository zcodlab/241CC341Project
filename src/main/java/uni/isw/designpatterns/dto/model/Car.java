package uni.isw.designpatterns.dto.model;

public class Car {
    public String make;
    public int numberOfSeats;
    public CarType type;
 
    //constructor, getters, setters etc.

    public Car(String make, int numberOfSeats, CarType type) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }
    
}
