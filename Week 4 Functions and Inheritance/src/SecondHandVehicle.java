public class SecondHandVehicle extends Vehicle {
    private int numberOfOwners;
    
    public SecondHandVehicle (String regNO, String make, int yearOfManufacture, double value, int numberOfOwners)
    {
        super(regNO,make,yearOfManufacture,value);
        this.numberOfOwners = numberOfOwners;
    }
    public int getNumberOfOwners()
    {
        return numberOfOwners;
    }
    public boolean hasMultipleOwners()
    {
        if (numberOfOwners>1){
            return true;
        }
        else {
            return false;
        }
    }
}
