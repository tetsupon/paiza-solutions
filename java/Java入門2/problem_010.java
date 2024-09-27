/ if文による条件分岐　比較演算子（演習１）

public class Main {
	public static void main(String[] args) {
		int age = (int)(Math.random() * 5 + 18);
		System.out.print(age + "才は");
		// ここにif文を追加する
        if (age < 20){
            System.out.println("飲酒不可");
        } else if (age > 20){
            System.out.println("飲酒可能");
        }
	}
}