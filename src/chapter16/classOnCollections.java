package chapter16;

import java.util.*;

public class classOnCollections {
    public static void main(String[] args) {
        List <String> names = List.of("Prof", "Kabir", "Fm");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        boolean list = names.contains("Fm");
        boolean list2 = names.contains("Folahan");
        System.out.println(list);
        System.out.println(list2);
        List<Integer> nums = new ArrayList<>();

        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(4,100);
//        todo: [20,30,40,50,0,0,0,0,0,100];

        List<Integer> number2 = Arrays.asList(1,2,3,4,5);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);


        List<String> word =  Arrays.asList("QWERT","ASDF","ZXCV");
        List<String> newNames = List.of("qwert","asdf","zxcv");


    }


}
