// 標準入力
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //sc変数が標準入力の入り口になっている。Scannerを使うと外部から直接読み込むことができる。
        String date = sc.next();              //next()メソッドで取り出したdata変数に代入している。文字列型(String)
        System.out.println("hello" + date);
    }
}


// 標準入力
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();               //整数型(int)、nextIntに
        System.out.println(date);
    }
}


// 標準入力
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        System.out.println(date * 2);
    }
}
