public class Vehicle {

    private int maxSpeed;
    private double cargoCapacity;

    public Vehicle(int maxSpeed, double cargoCapacity) {
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    public void deliver(String destination) {
        System.out.printf("Доставка в %S.\n", destination);
    }
}
