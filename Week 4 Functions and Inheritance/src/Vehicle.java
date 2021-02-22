public class Vehicle {
    private String regNO;
    private String make;
    private int yearOfManufacture;
    private double value;
    public Vehicle (String regNO, String make, int yearOfManufacture, double value) {
        this.regNO = regNO;
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.value = value;
    }
    public String getRegNO()
    {
        return regNO;
    }
    public String getMake()
    {
        return make;
    }
    public int getyearOfManufacture()
    {
        return yearOfManufacture;
    }
    public double getValue()
    {
        return value;
    }
    public void setValue(double a)
    {
        value = a;
    }
    int calculateAge(int b)
    {
        
        return (b - yearOfManufacture);
    }
}
