package miniopdracht10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VakantieSpel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int input = 0;
        do {
            try {
                String item = "";
                if (input == 0) {
                    System.out.print("Ik ga op vakantie en neem mee... ");
                    item = sc.nextLine();
                    System.out.println(String.format("Gezegd is: %s", item));
                    input++;
                } else {
                    String nextItem = sc.nextLine();
                    if (item.charAt(item.length() - 1) == nextItem.charAt(0)) {
                        String strToAdd = String.format("Gezegd is: %s, %s%n", item, nextItem);
                        sb.append(strToAdd);
                        System.out.println(sb.toString());
                    } else {
                        System.out.println("Het opgegeven woord start niet met de laaste letter van het vorige woord");
                    }
                    input++;
                }


            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Dat is geen woord");
                sc = new Scanner(System.in);
            }
        } while(input < 5);

    }

}
