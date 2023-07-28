package AnimalRegistry;

abstract class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void eat() {
        System.out.println(name + " ест.");
    }
    
    public void sleep() {
        System.out.println(name + " спит.");
    }
}
