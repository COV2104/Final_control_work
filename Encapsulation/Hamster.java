package Encapsulation;

class Hamster extends DomesticAnimal {
    public Hamster(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Хомяк пищит");
    }
}
