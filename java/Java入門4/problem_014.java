// 要素を合計を計算する(演習２)

public class Main {
    public static void main(String[] args) {
        int numbers[] = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int i : numbers) {
            // ここに、合計を計算するコードを記述する
            sum += i;
        }
        System.out.println(sum);
    }
}
