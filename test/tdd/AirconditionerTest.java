package tdd;

import tdd.Airconditioner.Airconditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirconditionerTest {
    @Test

    public void edeyOn() {

        // given that i have an Acconditioner
        Airconditioner amuletutu = new Airconditioner();
        //when I turn on my AC
        amuletutu.setedeyOn(true);
        // check if my amuletutu is on
        boolean amuletutuIsOn = amuletutu.getedeyOn();
        assertTrue(amuletutuIsOn);

    }

    @Test
    public void edeyOff() {
        // given that i have an Airconditioner
        Airconditioner amuletutu = new Airconditioner();
        // given that my Airconditioner is off
        amuletutu.setedeyOff(true);
        // check if my Airconditioner is off
        boolean amuletutuIsOff = amuletutu.getedeyoff();
        assertTrue(amuletutuIsOff);

    }

    @Test
    public void temperatureIncrease() {
        // given that i have Airconditioner
        Airconditioner amuletutu = new Airconditioner();
        // when my Airconditioner is on
        amuletutu.setedeyOn(true);
        amuletutu.settemperature(20);
        // when i increase by 10
        amuletutu.increaseTemperature(10);
        // check if the temperature has increase
        int increasetemperature = amuletutu.getTemperature();
        assertEquals(30, increasetemperature);

    }


    @Test
    public void decreaseTemperature(){
        //given that I have Airconditioner
        Airconditioner amuletutu = new Airconditioner();
        // when my Airconditioner is on
        amuletutu.setedeyOn(true);
        // when i increase the temperature by 30
        amuletutu.increaseTemperature(30);
        // when i decrease the temperature by 6
        amuletutu.decreaseTemperature(6);
        // check if the temperature has decreased
        int decreaseTemperature = amuletutu.getTemperature();
        assertEquals(24, decreaseTemperature);



    }
}


