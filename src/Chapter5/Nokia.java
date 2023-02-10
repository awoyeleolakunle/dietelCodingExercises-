package Chapter5;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                1. Phone Book
                2. Messages
                3. Chat
                4.Call Register
                5.Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminder
                11. Clock
                12. Profile
                13. Sim services
                
                """);
        System.out.println("pick an option");
        int userInput = input.nextInt();
        switch(userInput){
            case 1: {
                System.out.println("""
                        1. Search
                        2. Service Nos
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice
                                                
                        """);
                System.out.println("Enter an option");
                userInput = input.nextInt();
                switch (userInput) {
                    case 8:
                        System.out.println("""
                                1. Types of view
                                2. Memory status
                                """);
                        break;
                }
            }
            case 2:
                System.out.println("""
                        1. Write messages;
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Template
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """);

                System.out.println("press a number for more options");
                userInput = input.nextInt();
                switch(userInput){
                    case 7:
                        System.out.println("""
                                1. Set 1
                                2.Common
                              
                                """);

                        System.out.println("press a number for more options");
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("""
                                        1. Messages center number
                                        2. Messages sent as
                                        3. Message validity
                                        """);
                                break;
                            case 2:
                                System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """);
                                break;
                            default:
                                System.out.println("please go back to the previous page and pick the option");

                        }
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call list
                        5. Show call duration
                        6. Show call lost
                        7. Call cost settings
                        8. Prepaid credit
                        """);
                System.out.println(" press a number for more options");
                userInput = input.nextInt();
                switch(userInput){
                    case 5:
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dailled calls' duration
                                5. Clear timers
                                """);
                        break;
                    case 6:
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """);
                        break;
                    case 7:
                        System.out.println("""
                                1. Call cost limit
                                2. Show costs in
                                """);
                        break;
                    default:
                        System.out.println("please go back to the previous page and pick a correct option");


                }
                break;
            case 5:
                System.out.println("""
                        1. Ring tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tone
                        8. Vibrating alert
                        9. Screen saver 
                        
                        """);
                break;
            case 6:
                System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security
                        4. Restore factory setting
                        
                        """);
                System.out.println("please press an option for more information ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting option
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        break;
                    case 2:
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Light
                                6. Confirm SIM service actions
                                """);
                        break;
                    case 3:
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling 
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                        break;
                    default:
                        System.out.println("please go back to the previous page and pick a correct option ");
                }
                break;
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.println("""
                        1. Clock
                        """);

                System.out.println(" please press an option for more information ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                    System.out.println("""
                            1. Alarm clock
                            2. Clock setting
                            3. Date setting
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time
                            """);
                    break;
                    default:
                        System.out.println("please go back to the previous page and pick a correct option ");
                }
                break;
            case 12:
                System.out.println("Profile");
                break;
            case 13:
                System.out.println("""
                        SIM services
                        """);
                break;
            default:
                System.out.println("please go back to the previous page and pick a correct option");


        }





    }

}
