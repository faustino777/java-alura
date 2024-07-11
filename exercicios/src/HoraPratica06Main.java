public class HoraPratica06Main {
    public static void main(String[] args) {
        HoraPratica06Carro car = new HoraPratica06Carro();
        car.year = 2003;
        car.color = "blue";
        car.model = "Mercedes G65";

        car.displaysTechnicalSheet();
        car.calculateAge();
    }

}
