package Encapsulation;

class Camel extends DraughtAnimal {
    public Camel(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Верблюд мычит");
    }
}
