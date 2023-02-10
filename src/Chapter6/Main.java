package Chapter6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 18, Gender.MALE);
        Person person9 = new Person("Johnny Doe", 18,Gender.MALE);
        Person person2 = new Person("Jane Doe", 19,Gender.FEMALE);
        Person person3 = new Person("Janet Doe", 20, Gender.NON_BINARY);

        int numberOfMales=countMales(person, person2, person3, person9);
        int numberOfFemale=countFemales(person,person2,person3,person9);
       // System.out.println(numberOfMales);
        System.out.println(numberOfFemale);
        System.out.println(countMales(person, person2, person3,person9));
    }
    private static int countMales(Person...people){
        int counter=0;
        for(int i =0; i<people.length; i++){
            if (people[i].getGender()==Gender.MALE) counter++;
        }
        return counter;
    }
    private static int countFemales(Person...people){
        int counter=0;
        for(int i =0; i< people.length; i++){
            if (people[i].getGender()==Gender.FEMALE) counter++;
        }
        return counter;
    }
}

