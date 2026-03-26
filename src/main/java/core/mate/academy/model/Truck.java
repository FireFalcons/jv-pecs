package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;

    public Truck(int loadCapacity, String name, String color) {
        setLoadCapacity(loadCapacity);;
        setName(name);
        setColor(color);
    }

    public Truck() {
    }
    
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
