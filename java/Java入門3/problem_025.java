// 特定期間の西暦年と昭和年の対応表を作る(演習２)
// 1行目：開始年
// 2行目：期間
// 昭和年 = 西暦年 - 1925
// 出力：西暦X年は昭和Y年です

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int seireki, shouwa;
      Scanner sc = new Scanner(System.in);
      int start = sc.nextInt();
      int term = sc.nextInt();
      
      int stop = start + term - 1;
      for (seireki = start; seireki <= stop; seireki++){
        System.out.print("西暦" + seireki + "年は");
        shouwa = seireki - 1925;
        System.out.println("昭和" + shouwa + "年です");          
      }
    }
}