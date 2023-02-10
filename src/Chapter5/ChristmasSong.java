package Chapter5;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pick any day for the Christmas song");
        int userInput = input.nextInt();
        int counter =1;


        while (userInput!=0){
            switch(userInput){
                case 1:
                    System.out.println("On the first day of Christmas, my true love sent to me\n" +
                            "A partridge in a pear tree");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas, my true love sent to me\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas, my true love sent to me\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 4:
                    System.out.println("On the fourth day of Christmas, my true love sent to me\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas, my true love sent to me\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas, my true love sent to me\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas, my true love sent to me\n" +
                            "Seven swans a-swimming\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;

                case 8:
                    System.out.println("On the eighth day of Christmas, my true love sent to me\n" +
                            "Eight maids a-milking\n" +
                            "Seven swans a-swimming\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas, my true love sent to me\n" +
                            "Nine ladies dancing\n" +
                            "Eight maids a-milking\n" +
                            "Seven swans a-swimming\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas, my true love sent to me\n" +
                            "Ten lords a-leaping\n" +
                            "Nine ladies dancing\n" +
                            "Eight maids a-milking\n" +
                            "Seven swans a-swimming\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas, my true love sent to me\n" +
                            "Eleven pipers piping\n" +
                            "Ten lords a-leaping\n" +
                            "Nine ladies dancing\n" +
                            "Eight maids a-milking\n" +
                            "Seven swans a-swimming\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas, my true love sent to me\n" +
                            "Twelve drummers drumming\n" +
                            "Eleven pipers piping\n" +
                            "Ten lords a-leaping\n" +
                            "Nine ladies dancing\n" +
                            "Eight maids a-milking\n" +
                            "Seven swans a-swimming\n" +
                            "Six geese a-laying\n" +
                            "Five golden rings\n" +
                            "Four calling birds\n" +
                            "Three french hens\n" +
                            "Two turtle doves, and\n" +
                            "A partridge in a pear tree\n");


            }

            System.out.println("pick any day for the Christmas song");
             userInput = input.nextInt();
        }

    }
}
