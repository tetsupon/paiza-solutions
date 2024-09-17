import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = scan.next();

        if (greeting.equals("Hello")){       //Helloに等しい場合
            System.out.println("こんにちは");  //こんにちはと出力
        }else {                              //Hello以外の場合、
            System.out.println();            //何も表示しない
        }
    }
}
