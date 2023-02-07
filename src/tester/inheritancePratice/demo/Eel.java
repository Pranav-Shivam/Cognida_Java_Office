package tester.inheritancePratice.demo;

public class Eel extends Fish{
    private boolean releaseElectricity;

    public Eel(int height, float weight, String animalType, String bloodType, boolean aquatic, boolean hasGill, boolean releaseElectricity) {
        super(height, weight, animalType, bloodType, aquatic, hasGill);
        this.releaseElectricity = releaseElectricity;
    }

    public boolean getIsReleaseElectricity() {
        return releaseElectricity;
    }

    public void info() {
        System.out.println("Type of animal " + getAnimalType());
        System.out.println("Height of animal " + getHeight());
        System.out.println("Weight of animal " + getWeight());
        System.out.println("Blood Type of animal " + getBloodType());
        System.out.println("Aquatic or not : "+getIsAquatic());
        System.out.println("Gill or not : "+getIsHasGill());
        System.out.println("Release electricity or not : "+getIsReleaseElectricity());
    }
}
