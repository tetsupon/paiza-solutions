//条件に合わせて処理を変える(演習１)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
      
        if (number > 100) {
            System.out.println(number);
        } else {
            System.out.println("100以下です");
        }
    }
}