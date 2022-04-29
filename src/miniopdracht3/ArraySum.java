package miniopdracht3;

public class ArraySum {

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4};
        System.out.println(sumArray(intArray));
    }

    public static int sumArray(int[] intArray) {
        int sumArray = 0;
        int i;
        for (i = 0; i < intArray.length; i++) {
            sumArray = sumArray + intArray[i];
        }
        return sumArray;
    }

}
