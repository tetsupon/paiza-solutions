//条件に一致したら処理を実行(演習１)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
                                              //System.out.println(number);を消去しているのは、入力値(number)が表示されてしまうから
      
        if (number >= 100) {                  //入力値(number)が100以上の場合、
            System.out.println(number);      //入力した値(number)を表示
        }
    }
}