package AirLineFlight;

public class Plane {
    private static boolean [] seats = new boolean[10];
    private static int seatNumber;

    public Plane(){
    }

    public void setSeats(int seat) {
        seats[seat] = true;
    }

    public  boolean []getSeats() {
        return seats;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

}
