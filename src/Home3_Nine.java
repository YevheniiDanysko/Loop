import java.util.Scanner;

public class Home3_Nine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i = 2; i <= num + num ; i +=2) {
            result = result + i;
        }
        System.out.println(result);
       
    }
}