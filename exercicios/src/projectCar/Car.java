package projectCar;

public class Car {
    String model;
    double priceYear1;
    double priceYear2;
    double priceYear3;

    public void defineModel(String model) {
        this.model = model;
    }

    public void definePrice(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    protected double calculateLowestPrice() {
        double lowestPrice = priceYear1;

        if (priceYear2 < lowestPrice) {
            lowestPrice = priceYear2;
        }
        if (priceYear3 < lowestPrice) {
            lowestPrice = priceYear2;
        }
        return lowestPrice;
    }

    protected double calculateHighestPrice() {
        double highestPrice = priceYear1;

        if (priceYear2 > highestPrice) {
            highestPrice = priceYear2;
        }
        if (priceYear3 > highestPrice) {
            highestPrice = priceYear3;
        }
        return highestPrice;
    }


}
