//標準入力したデータを配列に格納する
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(data);
        
        String[] array = data.split(",");  //splitメソッドは引数(,)で指定した文字ででーたを分割して配列で取得するメソッド
        System.out.println(array[0]);     //array[0]
        System.out.println(array.length);  //分割した配列の要素数はlengthメソッドで
        
        for (String enemy : array) {
            System.out.println(enemy + "が現れた");   //分割したデータを１つずつ表示させる
        }
    }
}