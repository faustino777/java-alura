package animal;

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("MIAAAAAAAAAAAAU!");
    }

    void scratchFurniture() {
        System.out.println("Arranhando móveis...");
    }
}
