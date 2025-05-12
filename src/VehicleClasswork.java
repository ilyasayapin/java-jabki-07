public class VehicleClasswork {

    private String brand;

    public VehicleClasswork(String brand) {
        this.brand = brand;

        System.out.println("Заврешение работы конструктора Vehicle");
    }

    public void startEngine() {
        System.out.printf("Запуск двигателя для %s\n", this.brand);
    }
}