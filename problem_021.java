//文字列の一致を判定(演習２)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = scan.next();

        if (greeting.equals("Hello")){
            System.out.println("こんにちは");
        }else {
            System.out.println("さようなら");
        }
    }
}
