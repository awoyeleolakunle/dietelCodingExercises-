import java.util.ArrayList;

public class ExampleMain {

    private static boolean isPalindrom(int number){
        String temp =  String.valueOf(number);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = 0; i <temp.length() ; i++) {
            list.add(Integer.parseInt(String.valueOf(temp.charAt(i))));
        }
        for (int i = list.size()-1; i>=0; i--) {
            secondList.add(list.get(i));
        }
        return list.equals(secondList);
    }
}