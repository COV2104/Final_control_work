package Encapsulation;

class Cat extends DomesticAnimal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}
