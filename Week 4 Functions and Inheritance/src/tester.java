public class tester {
    public static void main(String[] args) {
        // The task requires us to test the secondhandvehicle class, so the commands used to test the vehicle class are commented out. 
        // However, if you wish to test the vehicle class, feel free to umcomment them. 
        // Vehicle a = new Vehicle("N1111", "Benz", 2010, 200000.0);
        // database.add(a);
        // System.out.println(a.getRegNO()+" "+a.getMake()+" "+a.getyearOfManufacture()+" "+a.getValue());
        // a.setValue(150000.0);
        // System.out.println(a.getRegNO()+" "+a.getMake()+" "+a.getyearOfManufacture()+" "+a.getValue());
        // System.out.println(a.calculateAge(2020));
        SecondHandVehicle b = new SecondHandVehicle("N2222", "Ford", 2011, 100000.0, 2);
        database.add(b);
        System.out.println(b.getRegNO()+" "+b.getMake()+" "+b.getyearOfManufacture()+" "+b.getValue()+" "+b.getNumberOfOwners());
        b.setValue(150000.0);
        System.out.println(b.getRegNO()+" "+b.getMake()+" "+b.getyearOfManufacture()+" "+b.getValue()+" "+b.getNumberOfOwners());
        System.out.println(b.calculateAge(2020));
        boolean f = b.hasMultipleOwners();
        if (f) {
            System.out.println("This is a second hand vehicle. ");
        }
        else {
            System.out.println("This is NOT a second hand vehicle. ");
        }
    }
}
