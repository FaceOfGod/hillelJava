package sample_parking;

/**
 * Created by Сергей on 07.12.2015.
 */
public class Parking {
    private ParkingSpase[] parkingSpases = new ParkingSpase[10];
    private int numOfSpase = 0;
    public void addParkingSpace(ParkingSpase parkingSpase){
        if(numOfSpase < parkingSpases.length-1){
            parkingSpases[numOfSpase] = parkingSpase;
            numOfSpase++;
        }
        else {
            ParkingSpase[] newParkingSpases = new ParkingSpase[parkingSpases.length*2];
            for(int i = 0; i < parkingSpases.length; i++){
                newParkingSpases[i] = parkingSpases[i];
            }
            newParkingSpases[numOfSpase] = parkingSpase;
            numOfSpase++;
            parkingSpases = newParkingSpases;

        }
    }


    public void addParkingSpace(String state){
        ParkingSpase parkingSpase = new ParkingSpase(numOfSpase,state);
        addParkingSpace(parkingSpase);
    }
    public void addCarInSpace(ParkingSpase setCar){
        setCar.setState("Busy place!!");
    }
    public void delCar(ParkingSpase delCar){
        delCar.setState("Free place!!");
    }
    public void print() {
        for(int i = 0; i<numOfSpase; i++){
            System.out.println(parkingSpases[i].getId() + " " + parkingSpases[i].getState() + '\n');
        }
    }

}


