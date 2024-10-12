// whileによるループ処理2

public class Main {
    public static void main(String[] args) {
        int i = 3;    // カウンタ変数の初期化
        while (i <= 10) {
            System.out.println("hello world " + i);    // 繰り返し処理
            i = i + 2;    // カウンタ変数の更新　+2ずつ上がる　カウンタ変数がないと無限ループになりエラーになってしまうので、カウンタ変数は必須
        }
        System.out.println ("last " + i);
    }
}