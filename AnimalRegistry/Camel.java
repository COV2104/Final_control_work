package AnimalRegistry;

class Camel extends PackAnimal {
    public Camel(String name) {
        super(name);
    }
    
    public void walkInDesert() {
        System.out.println(getName() + " ходит по пустыне.");
    }
}
