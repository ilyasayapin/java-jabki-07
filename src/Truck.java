public class Truck extends Vehicle{

    public Truck(int maxSpeed, double cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.println("Грузовик загружен.");
        super.deliver(destination);
    }

}
