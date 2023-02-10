package ArrayListTestAssignment;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayListImpl implements List {

    private int [] arraylist = {};

    int [] newArraylist = new int[1];

    @Override
    public boolean isEmpty() {
        if (newArraylist.length==0)
            return true;
        return false;
    }

    @Override
    public void add(int element) {

    }

    @Override
    public void remove(int element) {
        for (int i = 0; i <newArraylist.length ; i++) {
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int getIndexOf(int index) {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public void add(int index, int element) {
        arraylist[index] = element;
        index++;

    }
}