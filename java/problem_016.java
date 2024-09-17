//条件に一致したら処理を実行(演習２)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        if (number < 100 ){                    //入力値（number）が100より小さい(<)場合は
            System.out.println(number);        //入力値(number)を表示
        }
    }
}