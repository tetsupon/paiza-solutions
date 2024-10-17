// 西暦年と昭和年の対応表(演習１)
// 1926年から1988年までをループで出力
// ループ内で、各西暦年を昭和年に変換
public class Main {
    public static void main(String[] args) {
        int seireki = 0, shouwa = 0;                        //seirekiとshouwa変数を
        for (seireki = 1926; seireki <=1988; seireki++ ){.  //西暦1926から西暦1988までをループ処理(seireki変数に1926代入、1988以下までループ処理を続ける)
           System.out.print("西暦" + seireki + "年は");     //西暦で出力。printで改行しない
           shouwa = seireki- 1925;                          //shouwa変数にseireki変数-1925(昭和年)を代入
           System.out.println("昭和" + shouwa + "年です");  //元号で出力      
        }

    }
}
