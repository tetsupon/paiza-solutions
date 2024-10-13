// whileによるループ処理（演習３）
public class Main {
    public static void main(String[] args) {
		int i = 19;                     //初期値を19
		while(i >= 10) {                //変数iが10以上の場合は処理を実行
			System.out.println(i);      //条件式に該当するまで繰り返し処理を実行
			i = i - 2;                 //増分を-2にすることによって19,17,15...と奇数の数値のみ表示
		}
    }
}