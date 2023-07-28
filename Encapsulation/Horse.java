package Encapsulation;

class Horse extends DraughtAnimal {
    public Horse(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Лошадь ржет");
    }
}
