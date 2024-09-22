// 数の表示とサイコロ（演習２）

public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 50 + 50;     //Math.random() は0.0～1.0の範囲で乱数を生成するため、範囲を (99 - 50 + 1) つまり 50 とし、これに50を足すことで50～99の範囲のランダムな値を生成しています。
		int number = (int)rand;
		System.out.println("モンスターに、" + number + "のダメージを与えた");
	}
}