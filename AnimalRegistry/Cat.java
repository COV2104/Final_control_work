package AnimalRegistry;

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    
    public void meow() {
        System.out.println(getName() + " мяукает.");
    }
}
