// whileによるループ処理(演習１)
public class Main {
    public static void main(String[] args) {
        int i = 10;
        while(i >= 1){                  //変数iが1以下の場合
            System.out.println(i);      //繰り返し処理を実行
            i = i - 1;                  //カウンタ変数の更新を行い、i >= 1の条件式に当てはまらなくなるまで
        }
    }
}
