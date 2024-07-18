package projectCar;

public class ModelCar extends Car {
    private boolean sedan;
    private boolean hatch;
    private boolean suv;
    private boolean truck;

    public boolean isSedan() {
        return sedan;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }

    public boolean isHatch() {
        return hatch;
    }

    public void setHatch(boolean hatch) {
        this.hatch = hatch;
    }

    public boolean isSuv() {
        return suv;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public boolean isTruck() {
        return truck;
    }

    public void setTruck(boolean truck) {
        this.truck = truck;
    }

    protected String showCategory() {
        String category = "";

       if (truck) {
           category = "Caminhonete";
       }

       if (sedan) {
           category = "Sedan";
       }

       if (hatch) {
           category = "Hatch";
       }

       if (suv) {
           category = "SUV";
       }

       return category;
    }

    public void displaysInfo() {
        System.out.println("Modelo: " + model);
        System.out.println("A categoria do carro é: " + showCategory());
        System.out.println("Preço do primeiro ano: " + priceYear1);
        System.out.println("Preço do segundo ano: " + priceYear2);
        System.out.println("Preço do terceiro ano: " + priceYear3);
        System.out.println("Maior preço: " + calculateHighestPrice());
        System.out.println("Menor preço: " + calculateLowestPrice());
    }
}
