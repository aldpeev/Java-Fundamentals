package L08_ObjectsAndClasses.Exercise.P06VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private double power;

    public Vehicle(String type, String model, String color, double power) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public double getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f%n",this.type,this.model, this.color, this.power);
    }
}
