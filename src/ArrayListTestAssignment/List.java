package ArrayListTestAssignment;

public interface List {

    boolean isEmpty();

    void add(int element);

    void remove(int element);

    int size();

    int get(int index);

    int getIndexOf(int index);

    int getCapacity();

    void add(int firstElement, int secondElement);
}
