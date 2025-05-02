public class Drone extends Vehicle{

    public Drone(int maxSpeed, double cargoCapasity) {
        super(maxSpeed, cargoCapasity);
    }

    @Override
    public void deliver(String destination) {
        System.out.println("Дрон взлетел");
        super.deliver(destination);
    }
}
