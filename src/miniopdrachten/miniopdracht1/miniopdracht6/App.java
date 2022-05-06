package miniopdrachten.miniopdracht1.miniopdracht6;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String input = processString();
        System.out.println(input);


        String inputInAlphabeticOrder = getStringInAplhabeticOrder(input);

        System.out.println(inputInAlphabeticOrder);


    }

    public static String processString() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public static String getStringInAplhabeticOrder(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        s = new String(charArray);
        return s;
    }


}
