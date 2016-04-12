package sample_parking;

/**
 * Created by Сергей on 07.12.2015.
 */
public class ParkingUp {
    public static void main(String[] args) {
        ParkingSpase spaseOne = new ParkingSpase(1,"Free place.");
        ParkingSpase spaseTwo = new ParkingSpase(2,"Busy place.");
        ParkingSpase spaseThree = new ParkingSpase(3, "Busy place.");
        ParkingSpase spaseFoor = new ParkingSpase(4, "Free place.");


        Parking parking = new Parking();
        parking.addParkingSpace(spaseOne);
        parking.addParkingSpace(spaseTwo);
        parking.addParkingSpace(spaseThree);
        parking.addCarInSpace(spaseOne);
        parking.delCar(spaseTwo);
        parking.addParkingSpace(spaseFoor);
        parking.delCar(spaseOne);




        parking.print();

    }
}
