package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Кинг");
        Cat cat = new Cat("Василиса");
        Hamster hamster = new Hamster("Хома");
        Horse horse = new Horse("Буран");
        Camel camel = new Camel("Хасам");
        Donkey donkey = new Donkey("Иа");

        Animal[] animals = {dog, cat, hamster, horse, camel, donkey};

        for (Animal animal : animals) {
            System.out.print("Имя: " + animal.getName() + " - ");
            animal.makeSound();
        }
    }
}
