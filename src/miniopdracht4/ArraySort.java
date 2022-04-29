package miniopdracht4;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[]{4,3,2,1};
        System.out.println(arr2);

        System.out.println(Arrays.toString(sortArraySmallToBig(arr2)));
    }

    public static int[] sortArraySmallToBig(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
