import java.util.Scanner;

public class Home3_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int num1 = Integer.parseInt(sc.nextLine());
       int num2 = Integer.parseInt(sc.nextLine());

       for (int a = num1; a >= num2; a--) {
           System.out.println(a);
        }

    }
}