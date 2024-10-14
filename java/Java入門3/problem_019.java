// 標準入力とループ処理
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();               //nextメソッドは入力エリアから一行ずつ表示
        System.out.println("データ個数 " + count);
        
        //データ個数の回数だけループ処理でnextメソッドを繰り返す
        String date;
        for (int i = 0; i < count; i++){
            date = sc.next();
            System.out.println(date + "は、スライムを攻撃した");
        }
    }
}