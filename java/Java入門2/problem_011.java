// if文による条件分岐　比較演算子（演習２）

public class Main {
	public static void main(String[] args) {
		int place = (int)(Math.random() * 12+ 1);
		System.out.print(place + "位");
		// ここにif文を追加する
		if (place <= 6) {
			System.out.println("入賞");
		} else if(place >= 7){
			System.out.println("入賞圏外");
		}
	}
}