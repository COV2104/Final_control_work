package AnimalRegistry;

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println(getName() + " лает.");
    }
}
