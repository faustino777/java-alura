package animal;

public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("AU AU AU AU AU!");
    }

    void wagTail() {
        System.out.println("Abanando rabo...");
    }
}
