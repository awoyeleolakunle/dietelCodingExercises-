package AirLineFlight;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Airline {

    private static Plane plane = new Plane();
    static boolean isBooked = false;
    private static boolean[] seatss = new boolean[10];
    private int seatNumber;

    private static SecureRandom secureRandom = new SecureRandom();


    public void makeReservationForFirstClass() {

        seatNumber = secureRandom.nextInt(0, 5);

        if (seatss[seatNumber]) throw new IllegalArgumentException("The seat has been booked");
        seatss[seatNumber] = true;
        System.out.println("Congratulation, Your seat number is " + (seatNumber + 1));

        showBookedSeat();
    }

    public void showBookedSeat() {
        System.out.println(Arrays.toString(seatss));
    }

    public void makeReservationForEconomyClass() {


            seatNumber = secureRandom.nextInt(5, 10);

            if (seatss[seatNumber]) throw new IllegalArgumentException("The seat has been booked");
            seatss[seatNumber] = true;
            System.out.println("Congratulation, Your seat number is " + (seatNumber + 1));

            showBookedSeat();

        }

        public void makeOtherReservation () {
            System.out.println("Would You love to make a reservation in the first class ?");
            System.out.println("""
                    Press 1 >>>>  for Yes
                    Press 2 >>>>  for No
                    """);
        }
    }



