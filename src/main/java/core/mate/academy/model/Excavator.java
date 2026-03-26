package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketSize;

    public Excavator(int bucketSize, String name, String color) {
        setBucketSize(bucketSize);
        setName(name);
        setColor(color);
    }

    public Excavator() {
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
