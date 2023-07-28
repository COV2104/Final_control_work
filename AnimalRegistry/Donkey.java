package AnimalRegistry;

class Donkey extends PackAnimal {
    public Donkey(String name) {
        super(name);
    }
    
    public void bray() {
        System.out.println(getName() + " работает.");
    }
}
