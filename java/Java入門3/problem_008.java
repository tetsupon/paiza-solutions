// whileによるループ処理(演習２)
public class Main {
    public static void main(String[] args) {
        int i = 20;                      //変数i（初期値）が20
        while(i >= 10){                  //変数iが10以上の場合
            System.out.println(i);      //繰り返し処理を実行
            i = i - 1;                  //カウンタ変数の更新を行い、増分を-1にする
        }
    }
}

