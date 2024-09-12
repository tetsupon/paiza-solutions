//条件に合わせて処理を変える(演習２)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
      
        if (number == 100){                          //入力値が100と等しい場合
            System.out.println(number);              //入力値(number)と出力
        }else if (number > 100){                     //入力値が100より大きい場合
            System.out.println("100より大きい");       //100より大きいと出力
        }else {                                     //それ以外
            System.out.println("100より小さい");     //100より小さいと出力
        }
    }
}