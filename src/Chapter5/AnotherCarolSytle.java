package Chapter5;

import java.util.Scanner;

public class AnotherCarolSytle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String Chorus = "";
            String Day = "";
            String song = "";
            int counter = 1;

            for (; counter <= 12; counter++) {
                System.out.println("press any number for the Christmas song");
                int userInput = input.nextInt();
                switch (counter ) {
                    case 12:
                        Day = "Twelfth";
                        Chorus = "Twelve drummers drumming\n";
                        break;
                    case 11:
                        Day = "Eleventh";
                        Chorus = "Eleven pipers piping" + "\n";
                        break;
                    case 10:
                        Day = "tenth";
                        Chorus = "Ten lords a-leaping" + "\n";
                        break;
                    case 9:
                        Day = "nineth";
                        Chorus = "Nine ladies dancing\n";
                        break;
                    case 8:
                        Day = "eighth";
                        Chorus = "Eight maids a-milking\n";
                        break;
                    case 7:
                        Day = "seventh";
                        Chorus = ("Seven swans a-swimming\n");
                        break;
                    case 6:
                        Day = "sixth";
                        Chorus = "Six geese a-laying\n";
                        break;
                    case 5:
                        Day = "fifth";
                        Chorus = "Five golden rings\n";
                        break;
                    case 4:
                        Day = "Fourth";
                        Chorus = ("Four calling birds\n");
                        break;
                    case 3:
                        Day = "Third";
                        Chorus = "Three french hens\n";
                        break;
                    case 2:
                        Day = "Second";
                        Chorus = "Two turtle doves, and\n";
                        break;

                    case 1:
                        Day = "First";
                        Chorus = "A partridge in a pear tree\n";
                        break;

                }
                song = Chorus + " " + song;
                System.out.println("On the " + Day + "day" + " of Christmas, my true love sent to me\n" + song);
            }
        }
    }

