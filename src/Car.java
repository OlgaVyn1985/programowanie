public class Car {
    public String model;
    public String color;
    public String makeYear;
    public String fuelType;

    public Car(String model, String color, String makeYear, String fuelType) {
        this.model = model;
        this.color = color;
        this.makeYear = makeYear;
        this.fuelType = fuelType;
    }

    public void startEngine() {
        System.out.println("Silnik zostal urochomiony");
    }

    public void stopEngine(String percent) {
        System.out.println("Silnik zostal urochomiony 0" + "50");
    }
}





