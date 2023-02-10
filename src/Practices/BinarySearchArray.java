package Practices;

public class BinarySearchArray {
    public int BinarySearchArray(int[] arr, int l, int r, int x){
        if(r>=1) {
            int mid = l + (r - 1) / 2;
            if (arr[mid] == x)
                return mid;
                if (arr[mid] > x)
                    return BinarySearchArray(arr, l, mid - 1, x);
                return BinarySearchArray(arr, mid + 1, r, x);


        }
            return -1;
        }
    }

