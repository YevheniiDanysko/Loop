import java.util.Scanner;

public class Home3_Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int a = 1; a <= num; a += 2) {

            System.out.println(a);
        }

    }
}