package Encapsulation;

class Dog extends DomesticAnimal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Собака лает");
    }
}
