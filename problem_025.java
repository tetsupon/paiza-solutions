//複数のデータを受け取る（演習）

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();             //入力値を変数countに代入
        
        for (int i = 0; i < count; i++){        //i < countで上記の代入した入力値の数だけ繰り返し処理をする。
            System.out.println("Hello paiza");  //HEllo paizaという文字列を入力値だけ繰り返す。
        }
    }
}
