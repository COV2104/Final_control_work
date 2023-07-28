package AnimalRegistry;

class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }
    
    public void runInWheel() {
        System.out.println(getName() + " бегает в колесе.");
    }
}
