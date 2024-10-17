// 西暦年と平成年の対応表を作る
// 1989年から2016年までをループで出力
// ループ内で、各西暦年を平成年に変換

public class Main {
    public static void main(String[] args) {
        int seireki, heisei;                              //intでseirekiとheisei変数を用意
        for(seireki = 1989; seireki <= 2016; seireki++){  //seireki変数が2016以下の場合、ループ処理を繰り返す
            System.out.print("西暦" + seireki + "年は、");  //改行しないのでprintとする。
            heisei = seireki - 1988;
            System.out.println("平成" + heisei + "です。");
        }
    }
}