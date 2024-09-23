// 値段を計算する（演習１）

public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 10 + 1);	// 匹数 1 ～ 10
		System.out.println("体重100キロのスライムが、" + number + "匹あらわれた。");
		// 合計体重 =匹数 × 100
        System.out.println("スライムの合計体重は、" + (number * 100) + "キロです。");
	}
}