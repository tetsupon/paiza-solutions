// 値段を計算する

public class Main {
	public static void main(String[] args) {
		int apple_price = (int)(Math.random() * 3 + 1) * 100;  //リンゴの単価   1,2,3の中からランダムに選ばれる。 * 100で単価が100,200,300となる。
		int apple_num = (int)(Math.random() * 10 + 1); //リンゴを買う数   Math.randomを（）で囲むことでリンゴの個数を求めた後に整数に変換(int)
		System.out.println("リンゴの単価 : " + apple_price + "円");
		System.out.println("リンゴを買う数 : " + apple_num + "個");
		
		int total = apple_price * apple_num;
		System.out.println("合計金額 : " + total + "円");
	}
}
