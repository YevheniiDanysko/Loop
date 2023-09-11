import java.util.Scanner;

public class Home3_Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int a = 0; a < word.length(); a++) {

            System.out.println(word.charAt(a));
        }

    }
}