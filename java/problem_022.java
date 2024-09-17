//同じ処理を何度も繰り返す

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello paiza";

        for (int i = 0; i < 5; i++){                   //変数iを繰り返し回数のカウント(カウンタ変数)に使ってる。初期値(int i = 0),繰り返し条件で繰り返し処理実行(i < 5)5より小さい間実行を続ける,kカウンタ変数の増減（i++）++は変数iの値を1増やす
            System.out.println(greeting + ":" + i);
        }
    }
}
