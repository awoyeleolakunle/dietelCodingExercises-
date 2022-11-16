package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    @Test
    public void turnOn() {
        Bike okada = new Bike();
        okada.setTurnOn(true);
        // check if my bike is on
        boolean okadaIsOn = okada.getTurnOn();
        assertTrue(okadaIsOn);
    }

    public void turnOff() {
        Bike okada = new Bike();
        // when i turnoff my bike
        okada.setTurnOff(true);
        //check that the bike is off
        boolean okadaisOff = okada.getTurnOff();
        assertTrue(okadaisOff);
    }


    @Test
    public void accelerationTest() {
        Bike okada = new Bike();
        //given that my bike is on
        okada.setTurnOn(true);
        // when my speed is 16
        okada.setSpeed(19);
        // when my gear is 1
        okada.setAccelerationGear(1);
        // Check that my bike accelarate
        int okadaSpeed = okada.getAccelarationGear();
        assertEquals(20, okadaSpeed);


    }

    @Test
    public void acceleration2Test() {
        Bike okada = new Bike();
        //given that my bike is on
        okada.setTurnOn(true);
        // when my speed is 16
        okada.setSpeed(16);
        // when my gear is 1
        okada.setAccelerationGear(2);
        // Check that my bike accelarate
        int okadaSpeed = okada.getAccelarationGear();
        assertEquals(18, okadaSpeed);

    }

    @Test
    public void acceleration3Test() {
        Bike okada = new Bike();
        //given that my bike is on
        okada.setTurnOn(true);
        // when my speed is 16
        okada.setSpeed(35);
        // when my gear is 1
        okada.setAccelerationGear(3);
        // Check that my bike accelarate
        int okadaSpeed = okada.getAccelarationGear();
        assertEquals(38, okadaSpeed);


    }

    @Test
    public void acceleration4Test() {
        Bike okada = new Bike();
        //given that my bike is on
        okada.setTurnOn(true);
        // when my speed is 16
        okada.setSpeed(50);
        // when my gear is 4
        okada.setAccelerationGear(4);
        // Check that my bike accelarate
        int okadaSpeed = okada.getAccelarationGear();
        assertEquals(54, okadaSpeed);

    }

    @Test
    public void deccelerateTest() {
        //given that i have a bike
        Bike okada = new Bike();
        // given that the bike is on
        okada.setTurnOn(true);
        // when the speed is 23
        okada.setSpeed(20);
        //when the gear is 1
        okada.setDeccelerate(1);
        // check if my bike deccelarate
        int okadaSpeed = okada.getDeccelerate();
        assertEquals(19, okadaSpeed);
    }

    @Test
    public void deccelerate2Test() {
        // given that i have a bike
        Bike okada = new Bike();
        // given that the bike is on
        okada.setTurnOn(true);
        // when that the speed is 20
        okada.setSpeed(25);
        // when the gear is 2
        okada.setDeccelerate(2);
        // check if my bike deccelarate
        int okadaSpeed = okada.getDeccelerate();
        assertEquals(23, okadaSpeed);
    }

    @Test
    public void deccelerate3Test() {
        // Given that i have a bike
        Bike okada = new Bike();
        // given that the bike is on
        okada.setTurnOn(true);
        // when bike is on speed 20
        okada.setSpeed(20);
        // when my gear is 3
        okada.setDeccelerate(3);
        // check if my bike deccelerate
        int okadaSpeed = okada.getDeccelerate();
        assertEquals(17, okadaSpeed);
    }

    @Test
    public void deccelerate4Test() {
        // given that i have a bike
        Bike okada = new Bike();
        // given that the bike is on
        okada.setTurnOn(true);
        // given that speed is 20
        okada.setSpeed(41);
        // given that my gear is on 4
        okada.setDeccelerate(4);
        // check if the speed deccelerate
        int okadaSpeed = okada.getDeccelerate();
        assertEquals(45, okadaSpeed);

    }
}


