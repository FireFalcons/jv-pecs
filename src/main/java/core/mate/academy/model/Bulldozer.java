package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;

    public Bulldozer(int bladeWidth, String name, String color) {
        setBladeWidth(bladeWidth);
        setName(name);
        setColor(color);
    }

    public Bulldozer() {
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
