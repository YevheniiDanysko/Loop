import java.util.Scanner;

public class Home3_Ten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for (int i = num; i >= 1  ; i--) {
            result = result * i;
        }
        System.out.println(result);






    }
}