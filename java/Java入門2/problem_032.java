// whileによるループ処理（演習１）

public class Main {
    public static void main(String[] args) {
        int i = 2;                          //偶数のみ表示させたいので2からスタート
        while (i <= 10) {                  //10までの数字を表示させたいので10以下の条件式
            System.out.println( i );    
            i = i + 2;                     //偶数の表示(2飛ばしで)
        }
    }
}