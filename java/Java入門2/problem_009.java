// if文による条件分岐　比較演算子

public class Main {
	public static void main(String[] args) {
		int time = 13;
		if (time < 12) {
			System.out.println("午前中"); // 条件式が成立したときの処理
		} else if (time == 12){
		    System.out.println("正午");
		} else if (time > 12){
		    System.out.println("午後");
		}
	}
}
 
 
 // a < b aがbよりも小さい
 // a > b aがbよりも大きい
 // a <= b aがb以下である
 // a >= b aがb以上である
 // a != b aとbが等しくない