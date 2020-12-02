package Topic5.Assignment3.automobile.twowheeler;

import Topic5.Assignment3.automobile.Vehicle;

public class Hero extends Vehicle {
    public int Speed;
    private String ModelName;
    private String RegistrationNumber;
    private String OwnerName;

    public Hero(String ModelName, String RegistrationNumber, String OwnerName, int Speed) {
        super();
        this.ModelName = ModelName;
        this.RegistrationNumber = RegistrationNumber;
        this.OwnerName = OwnerName;
        this.Speed = Speed;
    }

    @Override
    public void getModelName() {
        System.out.println("Model Name= " + ModelName);
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("Registration Number= " + RegistrationNumber);
    }

    @Override
    public void getOwnerName() {
        System.out.println("Owner Name= " + OwnerName);
    }

    public void getSpeed() {
        System.out.println("Speed= " + Speed);
    }

    public void getRadio() { System.out.println("Accessing the radio"); }
}
