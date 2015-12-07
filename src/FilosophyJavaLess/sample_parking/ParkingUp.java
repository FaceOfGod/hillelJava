package FilosophyJavaLess.sample_parking;

/**
 * Created by Сергей on 07.12.2015.
 */
public class ParkingUp {
    public static void main(String[] args) {
        ParkingSpase spaseOne = new ParkingSpase(1,"Free place.");
        ParkingSpase spaseTwo = new ParkingSpase(2,"Busy place.");




        Parking parking = new Parking();
        parking.addParkingSpace(spaseOne);
        parking.addParkingSpace(spaseTwo);
        parking.print();
    }
}
