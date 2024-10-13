// forによるループ処理

public class Main {
    public static void main(String[] args) {
        int i;                                     //ループの外で変数を使用する場合は先に変数iを宣言しておく。（int i;をfor()の中ではなく宣言）
        for(i = 0; i <=2; i++){                    //カウンタ変数の初期化i = 0; 条件式i <= 4; カウンタ変数の更新i++),a = a + 1と同じ 
            System.out.println("hello world" + i); //繰り返し処理
        }
        System.out.println("last" + i);
    }
}
