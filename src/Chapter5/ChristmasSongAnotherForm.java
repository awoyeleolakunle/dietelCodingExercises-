package Chapter5;

import java.util.Scanner;

public class ChristmasSongAnotherForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chorus = "";
        String Day = "";
        String song = "";

        for (int counter = 1; counter <= 12; counter++) {
            System.out.println("please press " + counter + " for next verse of the Christmas song");
            int userInput = input.nextInt();
            if (userInput == counter) {
                switch (userInput) {

                    case 1:
                        Day = "First";
                        chorus = "A partridge in a pear tree\n";
                        break;
                    case 2:
                        Day = "Second";
                        chorus = "Two turtle doves, and\n";
                        break;
                    case 3:
                        Day = "Third";
                        chorus = "Three french hens\n";
                        break;
                    case 4:
                        Day = "Fourth";
                        chorus = ("Four calling birds\n");
                        break;
                    case 5:
                        Day = "fifth";
                        chorus = "Five golden rings\n";
                        break;
                    case 6:
                        Day = "sixth";
                        chorus = "Six geese a-laying\n";
                        break;
                    case 7:
                        Day = "seventh";
                        chorus = ("Seven swans a-swimming\n");
                        break;
                    case 8:
                        Day = "eighth";
                        chorus = "Eight maids a-milking\n";
                        break;
                    case 9:
                        Day = "nineth";
                        chorus = "Nine ladies dancing\n";
                        break;
                    case 10:
                        Day = "tenth";
                        chorus = "Ten lords a-leaping" + "\n";
                        break;
                    case 11:
                        Day = "Eleventh";
                        chorus = "Eleven pipers piping" + "\n";
                        break;
                    case 12:
                        Day = "Twelfth";
                        chorus = "Twelve drummers drumming\n";
                }
                song = chorus + " " + song;
                System.out.println("On the " + Day + "day" + " of Christmas, my true love sent to me\n" + song);

            } else {
                System.out.println("Olodo you have skipped a day. continue from the next day or restart the app");


            }
        }
    }
}