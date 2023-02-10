package Chapter4;

import java.util.Scanner;

public class TeamSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. GoalKeeper
                2. Right Wing Defender
                3. Left Wing Defender
                4. Defensive MidFielder
                5.  Central Defender
                6. Central Defender
                7. Attacking Right Winger
                8. Attacking MidFielder
                9. Striker
                10. Central MidFielder
                11. Attacking Left Winger
                
                """);
        System.out.println("pick a player position");
        int input = scanner.nextInt();
        switch(input){
            case 1:
                System.out.println(". Goal Keeper. baba dey keep like Peter Check");
                break;
            case 2:
                System.out.println(" Defender.  Set awon defender Yobo");
                break;
            case 3:
                System.out.println(" Defender. watimagbo Taye-Taiwo");
                break;
            case 4:
                System.out.println(" Defensive Midfielder. shey Ngolo Kante wakere ni? ");
                break;
            case 5:
                System.out.println("Central Defender. eyan John Terry. Agba ");
                break;
            case 6:
                System.out.println("Central Defender Aye. Eyan Thiago Silver");
                break;
            case 7:
                System.out.println("Attacking Winger Aye. set awon Arjen Rueben. ");
                break;
            case 8:
                System.out.println("  Attacking Midfielder. Agba Super Frank Lampard.");
                break;
            case 9:
                System.out.println(" Striker. Eyan Didier Drogba");
                break;
            case 10:
                System.out.println("Central Midfielder. The god of football. Lionel Messi ");
                break;
            case 11:
                System.out.println("Attacking Left Winger. Eyan Eden Hazard ");
                break;
            default:
                System.out.println("olodo You no sabi football");

        }



    }
}
