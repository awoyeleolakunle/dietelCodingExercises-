package tdd.Airconditioner;

public class Airconditioner {
    private boolean edeyOff;
    private int temperature;
    private boolean edeyOn;

    public void setedeyOn(boolean value ){
            edeyOn = value;
            if (edeyOn) {
                edeyOff = false;
            }
    }

    public boolean getedeyOn() {
        return edeyOn;
    }
    public void setedeyOff(boolean value ){
            edeyOff = value;
            if (edeyOff){
                edeyOn = false;
            }
    }
public boolean getedeyoff(){
        return edeyOff;
}

    public void increaseTemperature(int degree) {
        if (edeyOn && temperature + degree  <= 30 ){
            temperature = temperature + degree;}
           else if (temperature + degree > 30){
                temperature = 30;}
     }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int degree) {
        if (edeyOn && temperature - degree >= 16 ) {
            temperature = temperature - degree;
        }
           else if (temperature - degree <16) {
                temperature = 16;
            }
    }

    public void settemperature(int degree) {
        temperature = degree;


        }
    }

