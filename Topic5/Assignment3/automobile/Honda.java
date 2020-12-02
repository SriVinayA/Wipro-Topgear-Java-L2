package Topic5.Assignment3.automobile;

public class Honda extends Vehicle{
    private String ModelName;
    private String RegistrationNumber;
    private String OwnerName;
    private int Speed;

    public Honda(String ModelName, String RegistrationNumber, String OwnerName, int Speed) {
        super();
        this.ModelName = ModelName;
        this.RegistrationNumber = RegistrationNumber;
        this.OwnerName = OwnerName;
        this.Speed = Speed;
    }

    @Override
    public void getModelName() {
        System.out.println("ModelName= " + ModelName);
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("Registration Number= " + RegistrationNumber);
    }

    @Override
    public void getOwnerName() {
        System.out.println("OwnerName= " + OwnerName);
    }

    public void getSpeed() {
        System.out.println("Speed= " + Speed);
    }

    public void CdPlayer() {
        System.out.println("Accessing the Cd Player");
    }
}
