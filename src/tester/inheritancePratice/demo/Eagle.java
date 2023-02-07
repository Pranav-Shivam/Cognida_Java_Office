package tester.inheritancePratice.demo;

public class Eagle extends Bird {
    private String typeOfEagle;

    public Eagle(int height, float weight, String animalType, String bloodType, boolean feathers, String typeOfEagle) {
        super(height, weight, animalType, bloodType, feathers);
        this.typeOfEagle = typeOfEagle;
    }

    public String getTypeOfEagle() {
        return typeOfEagle;
    }

    public void info() {
        System.out.println("Type of animal " + getAnimalType());
        System.out.println("Height of animal " + getHeight());
        System.out.println("Weight of animal " + getWeight());
        System.out.println("Blood Type of animal " + getBloodType());
        System.out.println("Feather are there " + getFeathers());
        System.out.println("Type of Eagle " + getTypeOfEagle());
        if (canFly()) {
            System.out.println("Eagle can fly :)");
        }
    }
}
