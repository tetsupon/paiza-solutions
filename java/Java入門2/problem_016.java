// 西暦年から平成年を求める

import java.util.Calendar;
public class Main {
	public static void main(String[] args) {
	    Calendar calendar = Calendar.getInstance();
	    int seireki = calendar.get(Calendar.YEAR);  //現在の西暦を自動で出してくれるので、下はコメントアウト
        //int seireki = 2015;
        System.out.print("西暦" + seireki + "年は、");  //lnを抜かして改行しないようにする
        
        //西暦年から平成年を計算
        //平成1年とは、西暦1989年。その差は、1988
        //西暦 - 1988 = 平成*年
        //例: 西暦1989年 - 1988 = 平成1年
        //例: 西暦2015年 - 1988 = 平成27年
        
        int heisei = seireki - 1988;
        System.out.println("平成" + heisei + "年です！");
	}
}