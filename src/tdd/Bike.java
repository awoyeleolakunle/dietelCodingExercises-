package tdd;

public class Bike {
    private boolean turnOn;
    private boolean turnOff;
    private int speed;


    public void setTurnOn(boolean value) {
        turnOn = value;
        if (turnOn) {
            turnOff = false;
        }

    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOff(boolean value){
        turnOff = value;
        if (turnOff ){
            turnOn = false;
        }
    }

    public boolean getTurnOff() {
        return turnOff;

    }

    public void setSpeed (int speed){
        this.speed = speed;
    }

    public void setAccelerationGear(int gear) {
        if ((turnOn) &&
        gear == 1 && speed<=19){
            speed = gear + speed;}
        if ( (turnOn) &&
                (gear ==2 && (speed >20 && speed<=28 ))){
            speed = gear + speed;}
        if ((turnOn) &&
                gear ==3 && speed>30 && speed <=37){
            speed = gear + speed;
        }
        if ((turnOn) &&
                gear ==4 && speed>40) {
            speed = gear + speed;
        }
        }


    public int getAccelarationGear() {
        return speed;
    }

    public void setDeccelerate(int gear) {
        if ((turnOn) &&
                gear == 1 && speed <= 20) {
            speed = speed - gear;
        }
        if ((turnOn) &&
                gear == 2 && speed > 20 && speed <= 30) {
            speed = speed - gear;
        }
        if ((turnOn) &&
                gear == 3 && speed > 30 && speed <= 40) {
            speed = speed - gear;
        }
        if ((turnOn) &&
                gear == 4 && speed > 40) {
            speed = speed - gear;

        }
    }

    public int getDeccelerate() {
        return speed;
    }
}
