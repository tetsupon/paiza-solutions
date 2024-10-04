// whileによるループ処理

public class Main {
    public static void main(String[] args) {
        int i = 0;    // カウンタ変数の初期化
        while (i <= 5) {    // 0　-> 1 -> 2 -> 3 ・・・ 5 -> 6 whileの条件式が成立するまで繰り返す
            System.out.println("hello world " + i);    // 繰り返し処理
            i = i + 1;    // カウンタ変数の更新(i + 1を計算してi変数に代入)
        }
        System.out.println("last " + i); //i変数が6になり、繰り返し処理が終わる
    }
}