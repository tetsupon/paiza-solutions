// if文による条件分岐（演習２）

public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if (number == 1){
		    System.out.println("おめでとう！");
		}else {
		    System.out.println("あと少し！");
		}
	}
}