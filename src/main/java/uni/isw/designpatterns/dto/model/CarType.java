package uni.isw.designpatterns.dto.model;

public class CarType {
    int id;
    String name;

    public CarType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CarType(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}
