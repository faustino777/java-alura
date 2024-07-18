package projectCar;

public class Main {
    public static void main(String[] args) {
        ModelCar hilux = new ModelCar();
        hilux.defineModel("Hilux");
        hilux.setTruck(true);
        hilux.definePrice(300000, 350000, 400000);
        hilux.displaysInfo();
    }
}
