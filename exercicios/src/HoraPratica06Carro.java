import java.time.LocalDate;

public class HoraPratica06Carro {
    String model;
    int year;
    int yearsOld;
    String color;
    int currentYear = LocalDate.now().getYear();

    void displaysTechnicalSheet() {
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Cor: " + color);
    }

    void calculateAge() {
        yearsOld = currentYear - year;
        System.out.println("Este carro tem " + yearsOld + " anos, de idade.");
    }


}
