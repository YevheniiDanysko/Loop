import java.util.Scanner;

public class Home3_Six {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int result = 0;
        String word1 = "";
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                    result += 1;
                    break;
                case 'e': result += 2; break;
                case 'i': result += 3; break;
                case 'o': result += 4; break;
                case 'u': result += 5; break;


            }

        }
        System.out.println(result);
    }
}