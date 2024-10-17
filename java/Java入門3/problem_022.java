// 標準入力とループ処理(演習３)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        String line;
        for(int i = 0; i < count; i++){
            line = sc.next();
            System.out.println(line);
        }
    }
}