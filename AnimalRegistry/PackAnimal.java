package AnimalRegistry;

class PackAnimal extends Animal {
    public PackAnimal(String name) {
        super(name);
    }
    
    public void carryLoad() {
        System.out.println(getName() + " несет груз.");
    }
}
