package sample_parking;

/**
 * Created by Сергей on 07.12.2015.
 */
public class ParkingSpase {
    private int id = 0;
    private String state = "";

    public ParkingSpase() {
        this.id = 0;
        this.state = "N/A";
    }

    public ParkingSpase(int id, String state) {
        this.id = id;
        this.state = state;
    }
    public ParkingSpase(ParkingSpase prSp){
        this.id = prSp.id;
        this.state = prSp.state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
