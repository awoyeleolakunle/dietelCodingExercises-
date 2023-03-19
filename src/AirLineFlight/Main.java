package AirLineFlight;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static Airline airline = new Airline();

    public static void main(String[] args) {
        main();
    }

    public static void main() {
        System.out.println(" Welcome to God's Grace Airline");
        do {
            System.out.println("""
                    Press 1 >>>>> to make a reservation in First class
                    Press 2 >>>>> to ake a reservation in the economy class
                    """);
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> makeReservationForFirstClass();
                case 2 -> makeReservationForEconomy();
            }

        } while (!Airline.isBooked);
    }


    private static void makeReservationForEconomy() {

        try {
            System.out.println("Here is your flight Ticket");
            airline.makeReservationForEconomyClass();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void makeReservationForFirstClass() {
        try {
            System.out.println("Here is your flight Ticket");
            airline.makeReservationForFirstClass();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
