import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int num1 = scanner.nextInt();
        System.out.println(method(num, num1));
    }

    public static  String method (String a, int b) {
        return a.substring(b);
    }
}