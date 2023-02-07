package tester.inheritancePratice.demo;

public class Fish  extends Animal{
    private boolean aquatic;
    private boolean hasGill;

    public Fish(int height, float weight, String animalType, String bloodType, boolean aquatic, boolean hasGill) {
        super(height, weight, animalType, bloodType);
        this.aquatic = aquatic;
        this.hasGill = hasGill;
    }

    public boolean getIsAquatic() {
        return aquatic;
    }

    public boolean getIsHasGill() {
        return hasGill;
    }
}
