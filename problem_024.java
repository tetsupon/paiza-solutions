//複数のデータを受け取る

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();              //入力した数値をcountに代入
        System.out.println(count);               //入力した数値を出力している
        
        for (int i = 0; i < count; i++){         //for文で繰り返し処理。i < countで入力した数値のかずだけ区繰り返す。
            String name = scan.next();           //変数nameに入力した文字列を代入
            System.out.println("Hello " + name); //入力数値3、world,java,paizaの文字列を入力すると、Hello 〇〇と3回処理が行われる
        }
    }
}
