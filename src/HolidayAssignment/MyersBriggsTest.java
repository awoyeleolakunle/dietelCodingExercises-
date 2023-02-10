package HolidayAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggsTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> extroIntro_A = new ArrayList<>();
        ArrayList<String> extroIntro_B = new ArrayList<>();
        ArrayList<String> senIntui_A = new ArrayList<>();
        ArrayList<String> senIntui_B = new ArrayList<>();
        ArrayList<String> thinkFeel_A = new ArrayList<>();
        ArrayList<String> thinkFeel_B = new ArrayList<>();
        ArrayList<String> judgePercep_A = new ArrayList<>();
        ArrayList<String> judgePercep_B = new ArrayList<>();
        String response = "";
        String question = "";
        System.out.println(" what is your name ");
        String name = scanner.next();

        for (int count = 1; count <= 20; count++) {
            switch (count) {
                case 1: {
                    question = " A. expand energy, enjoy group,          B. conserve energy, enjoy one-on-one";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        extroIntro_A.add(response + ". expand energy, enjoy group");
                    } else if (response.equalsIgnoreCase("B")) {
                        extroIntro_B.add(response + ". conserve energy, enjoy one-on-one");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                extroIntro_A.add(response + ". expand energy, enjoy group");
                            } else if (response.equalsIgnoreCase("B")) {
                                extroIntro_B.add(response + ". conserve energy, enjoy one-on-one");
                            }
                        }

                    } break;
                }
                case 2: {
                    question = " A. Interpret literally,          B. look for meaning and possibilities";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        senIntui_A.add(response + ". Interpret literally");
                    } else if (response.equalsIgnoreCase("B")) {
                        senIntui_B.add(response + ". look for meaning and possibilities");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                senIntui_A.add(response + ". Interpret literally");
                            } else if (response.equalsIgnoreCase("B")) {
                                senIntui_B.add(response + ". look for meaning and possibilities");
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    question = " A. logical, thinking, questioning,          B. empathetic, feeling, accommodating";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        thinkFeel_A.add(response + ". logical, thinking, questioning");
                    } else if (response.equalsIgnoreCase("B")) {
                        thinkFeel_B.add(response + ". empathetic, feeling, accommodating");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                thinkFeel_A.add(response + ". logical, thinking, questioning");
                            } else if (response.equalsIgnoreCase("B")) {
                                thinkFeel_B.add(response + ". empathetic, feeling, accommodating");
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    question = " A. organised, orderly          B. flexible, adaptable";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        judgePercep_A.add(response + ". organised, orderly");
                    } else if (response.equalsIgnoreCase("B")) {
                        judgePercep_B.add(response + ". flexible, adaptable");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                judgePercep_A.add(response + ". organised, orderly");
                            } else if (response.equalsIgnoreCase("B")) {
                                judgePercep_B.add(response + ". flexible, adaptable");
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    question = " A. more outgoing, think out loud,          B. more reserved, think to yourself";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        extroIntro_A.add(response + ". more outgoing, think out loud");
                    } else if (response.equalsIgnoreCase("B")) {
                        extroIntro_B.add(response + ". more reserved, think to yourself");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                extroIntro_A.add(response + ". more outgoing, think out loud");
                            } else if (response.equalsIgnoreCase("B")) {
                                extroIntro_B.add(response + ". more reserved, think to yourself");
                            }

                        }
                    }
                    break;
                }
                case 6: {
                    question = " A. practical, realistic, experiential,          B. imaginative, innovative, theoretical";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        senIntui_A.add(response + ". practical, realistic, experiential");
                    } else if (response.equalsIgnoreCase("B")) {
                        senIntui_B.add(response + ". imaginative, innovative, theoretical");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                senIntui_A.add(response + ". practical, realistic, experiential");
                            } else if (response.equalsIgnoreCase("B")) {
                                senIntui_B.add(response + ". imaginative, innovative, theoretical");
                            }
                        }
                    }
                    break;
                }
                case 7:{
                    question = " A. Candid, straight forward, frank,          B. tactful, kind, encouraging";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        thinkFeel_A.add(response + ".  Candid, straight forward, frank");
                    } else if (response.equalsIgnoreCase("B")) {
                        thinkFeel_B.add(response + ". tactful, kind, encouraging");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                thinkFeel_A.add(response + ".  Candid, straight forward, frank");
                            } else if (response.equalsIgnoreCase("B")) {
                                thinkFeel_B.add(response + ". tactful, kind, encouraging");
                            }
                        }
                    }
                    break;
                }
                case 8:{
                    question = " A. plan, schedule          B. unplanned, spontaneous";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        judgePercep_A.add(response + ".  plan, schedule");
                    } else if (response.equalsIgnoreCase("B")) {
                        judgePercep_B.add(response + ". unplanned, spontaneous");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                judgePercep_A.add(response + ".  plan, schedule");
                            } else if (response.equalsIgnoreCase("B")) {
                                judgePercep_B.add(response + ". unplanned, spontaneous");
                            }
                        }
                    }
                    break;
                }
                case 9:{
                    question = " A. seek many task, public activities, interactions with others          B. seek private, solitary activities with quiet to concentrate";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        extroIntro_A.add(response + ". seek many task, public activities, interactions with others");
                    } else if (response.equalsIgnoreCase("B")) {
                        extroIntro_B.add(response + ". seek private, solitary activities with quiet to concentrate");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                extroIntro_A.add(response + ". seek many task, public activities, interactions with others");
                            } else if (response.equalsIgnoreCase("B")) {
                                extroIntro_B.add(response + ". seek private, solitary activities with quiet to concentrate");
                            }
                        }
                    }
                    break;
                }
                case 10:{
                    question = " A. standard, usual, conventional          B. different, novel, unique";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        senIntui_A.add(response + ". standard, usual, conventional");
                    } else if (response.equalsIgnoreCase("B")) {
                        senIntui_B.add(response + ". different, novel, unique");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                senIntui_A.add(response + ". standard, usual, conventional");
                            } else if (response.equalsIgnoreCase("B")) {
                                senIntui_B.add(response + ". different, novel, unique");
                            }
                        }
                    }
                    break;
                }
                case 11:{
                    question = " A. firm, tend to criticize, hold the line          B. gentle, tend to appreciate, conciliate";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        thinkFeel_A.add(response + ".  firm, tend to criticize, hold the line");
                    } else if (response.equalsIgnoreCase("B")) {
                        thinkFeel_B.add(response + ". gentle, tend to appreciate, conciliate");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                thinkFeel_A.add(response + ".  firm, tend to criticize, hold the line");
                            } else if (response.equalsIgnoreCase("B")) {
                                thinkFeel_B.add(response + ". gentle, tend to appreciate, conciliate");
                            }
                        }
                    }
                    break;
                }
                case 12:{
                    question = "  A. regulated, structured           B. easygoing , live, let live ";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        judgePercep_A.add(response + ".   regulated, structured");
                    } else if (response.equalsIgnoreCase("B")) {
                        judgePercep_B.add(response + ". easygoing , live, let live");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                judgePercep_A.add(response + ".   regulated, structured");
                            } else if (response.equalsIgnoreCase("B")) {
                                judgePercep_B.add(response + ". easygoing , live, let live");
                            }
                        }
                    }
                    break;
                }
                case 13:{
                    question = " A. external, communicative, express yourself          B. internal, reticent, keep to yourself";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        extroIntro_A.add(response + ".  external, communicative, express yourself");
                    } else if (response.equalsIgnoreCase("B")) {
                        extroIntro_B.add(response + ". internal, reticent, keep to yourself");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                extroIntro_A.add(response + ".  external, communicative, express yourself");
                            } else if (response.equalsIgnoreCase("B")) {
                                extroIntro_B.add(response + ". internal, reticent, keep to yourself");
                            }
                        }
                    }
                    break;
                }
                case 14:{
                    question = " A. focus on here-and-now         B. look to the future, global perspective, big picture";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        senIntui_A.add(response + ". focus on here-and-now");
                    } else if (response.equalsIgnoreCase("B")) {
                        senIntui_B.add(response + ". look to the future, global perspective, big picture");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                senIntui_A.add(response + ". focus on here-and-now");
                            } else if (response.equalsIgnoreCase("B")) {
                                senIntui_B.add(response + ". look to the future, global perspective, big picture");
                            }
                        }
                    }
                    break;
                }
                case 15:{
                    question = " tough-minded,  just          B. tender-hearted, merciful";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        thinkFeel_A.add(response + ".  tough-minded,  just");
                    } else if (response.equalsIgnoreCase("B")) {
                        thinkFeel_B.add(response + ". tender-hearted, merciful");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                thinkFeel_A.add(response + ".  tough-minded,  just");
                            } else if (response.equalsIgnoreCase("B")) {
                                thinkFeel_B.add(response + ". tender-hearted, merciful");
                            }
                        }
                    }
                    break;
                }
                case 16:{
                    question = "  A. preparation, plan ahead           B. go with the flow, adapt as you go ";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        judgePercep_A.add(response + ".   preparation, plan ahead");
                    } else if (response.equalsIgnoreCase("B")) {
                        judgePercep_B.add(response + ". go with the flow, adapt as you go");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                judgePercep_A.add(response + ".   preparation, plan ahead");
                            } else if (response.equalsIgnoreCase("B")) {
                                judgePercep_B.add(response + ". go with the flow, adapt as you go");
                            }
                        }
                    }
                    break;
                }
                case 17:{
                    question = " A. active, initiate          B. reflective, deliberate";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        extroIntro_A.add(response + ".  active, initiate");
                    } else if (response.equalsIgnoreCase("B")) {
                        extroIntro_B.add(response + ". reflective, deliberate");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                extroIntro_A.add(response + ".  active, initiate");
                            } else if (response.equalsIgnoreCase("B")) {
                                extroIntro_B.add(response + ". reflective, deliberate");
                            }
                        }
                    }
                    break;
                }
                case 18:{
                question = " A. fact, things, what is        B. ideas, dreams, what could be, philosophical";
                System.out.println(question);
                response = scanner.next();
                if (response.equalsIgnoreCase("A")) {
                    senIntui_A.add(response + ". fact, things, what is");
                } else if (response.equalsIgnoreCase("B")) {
                    senIntui_B.add(response + ". ideas, dreams, what could be, philosophical");
                } else {
                    while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                        chooseRightOption();
                        System.out.println(question);
                        response = scanner.next();
                        if (response.equalsIgnoreCase("A")) {
                            senIntui_A.add(response + ". fact, things, what is");
                        } else if (response.equalsIgnoreCase("B")) {
                            senIntui_B.add(response + ". ideas, dreams, what could be, philosophical");
                        }
                    }
                }
                break;
            }
                case 19:{
                    question = " matter of fact          B. sensitive, people-oriented, compassionate";
                    System.out.println(question);
                    response = scanner.next();
                    if (response.equalsIgnoreCase("A")) {
                        thinkFeel_A.add(response + ".  matter of fact");
                    } else if (response.equalsIgnoreCase("B")) {
                        thinkFeel_B.add(response + ". sensitive, people-oriented, compassionate");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                thinkFeel_A.add(response + ".  matter of fact");
                            } else if (response.equalsIgnoreCase("B")) {
                                thinkFeel_B.add(response + ". sensitive, people-oriented, compassionate");
                            }
                        }
                    }
                    break;
                }
                case 20:{
                    question = "  A. control, govern            B. latitude, freedom ";
                    System.out.println(question);
                    response = scanner.next();

                    if (response.equalsIgnoreCase("A")) {
                        judgePercep_A.add(response + ".   control, govern");
                    } else if (response.equalsIgnoreCase("B")) {
                        judgePercep_B.add(response + ". latitude, freedom");
                    } else {
                        while (!((response.equalsIgnoreCase("A")) || (response.equalsIgnoreCase("B")))) {
                            chooseRightOption();
                            System.out.println(question);
                            response = scanner.next();
                            if (response.equalsIgnoreCase("A")) {
                                judgePercep_A.add(response + ".   control, govern");
                            } else if (response.equalsIgnoreCase("B")) {
                                judgePercep_B.add(response + ". latitude, freedom");
                            }
                        }
                    }
                    break;

                }
                }
            }
        System.out.println(" Hello " + name + " You Selected ");
        System.out.println();
        for (String record:extroIntro_A) {
            System.out.println(record);
        }
        for (String record:extroIntro_B) {
            System.out.println(record);
        }
        System.out.println("The total number of A  selected : " + extroIntro_A.size());
        System.out.println("The total number of B  selected : " + extroIntro_B.size());
        System.out.println();

        for (String record:senIntui_A) {
            System.out.println(record);
        }
        for (String record:senIntui_B) {
            System.out.println(record);
        }
        System.out.println("The total number of A  selected : " + senIntui_A.size());
        System.out.println("The total number of B  selected : " + senIntui_B.size());
        System.out.println();

        for (String record:thinkFeel_A) {
            System.out.println(record);
        }
        for (String record:thinkFeel_B) {
            System.out.println(record);
        }
        System.out.println("The total number of A  selected : " + thinkFeel_A.size());
        System.out.println("The total number of B  selected : " + thinkFeel_B.size());
        System.out.println();

        for (String record:judgePercep_A) {
            System.out.println(record);
        }
        for (String record:judgePercep_B) {
            System.out.println(record);
        }
        System.out.println("The total number of A selected : " + judgePercep_A.size());
        System.out.println("The total number of B selected : " + judgePercep_B.size());
        System.out.println();

        }
        private static void chooseRightOption(){
            System.out.println("Expected A or B as Response\n I know this is an error, Please retry again");
        }
    }

