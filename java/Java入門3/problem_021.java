// 標準入力とループ処理(演習２)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = num1; i<= num2; i++){
            System.out.println(i);
        }
    }
}
