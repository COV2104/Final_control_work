package Encapsulation;

class Donkey extends DraughtAnimal {
    public Donkey(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Осел говорит иа-иа");
    }
}
