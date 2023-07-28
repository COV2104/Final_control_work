package AnimalRegistry;

import java.util.ArrayList;
import java.util.List;

class Pet extends Animal {
    private List<String> tricks;
    
    public Pet(String name) {
        super(name);
        tricks = new ArrayList<>();
    }
    
    public void play() {
        System.out.println(getName() + " играет.");
    }
    
    public void learnTrick(String trick) {
        tricks.add(trick);
    }
    
    public void performTrick(String trick) {
        if (tricks.contains(trick)) {
            System.out.println(getName() + " выполняет команду: " + trick);
        } else {
            System.out.println(getName() + " не знает как выполнить эту команду.");
        }
    }
}
