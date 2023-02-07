package tester.inheritancePratice.demo;

public class Bird extends Animal{
    private boolean feathers;

    public Bird(int height, float weight, String animalType, String bloodType, boolean feathers) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
    }

    public boolean getFeathers() {
        return feathers;
    }


    public boolean canFly()
    {
        if (feathers && getWeight()<=5 && getWeight()>0.5) {
            return true;
        }
        return false;
    }
}
