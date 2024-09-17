import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            System.out.println(number);

            if (number == 10) {
                System.out.println(number + "は10に等しい");
            } else if (number > 10) {
                System.out.println(number + "は10より大きい");
            } else {
                System.out.println(number + "は10未満");
            }
        }
    }
}