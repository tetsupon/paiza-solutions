//複数データを分類する（演習
）
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            
            
            if (number == 0) {
                System.out.println(number + "は0");
            }else if (number > 0) {
                System.out.println(number + "はプラス");
            }else {
                System.out.println(number + "はマイナス");
            }
        }
    }
}