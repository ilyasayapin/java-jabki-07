public class Drone extends Vehicle{

    public Drone(int maxSpeed, double cargoCapasity) {
        super(maxSpeed, cargoCapasity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Дрон взлетел. ");
        super.deliver(destination);
    }
}
