package miniopdrachten.miniopdracht1;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "dop";
        String str2 = "erwt";
        String str3 = "en";
        String result;
        result = str1 + str2 + str3;
        System.out.println(result);
        String result2;
        result2 = str1.concat(str2).concat(str3);

        System.out.println(result2);

        String result3;
        result3 = new StringBuilder(str1).append(str2).toString();
        result3 = new StringBuilder(result3).append(str3).toString();
        System.out.println(result3);

    }
}
