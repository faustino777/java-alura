package Animal;

public class Main {
    public static void main(String[] args) {
        Cat gato = new Cat();
        Dog cachorro = new Dog();

        gato.makeSound();
        gato.scratchFurniture();

        cachorro.makeSound();
        cachorro.wagTail();
    }
}
