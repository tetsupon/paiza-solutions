// 順位に合わせてメッセージを表示する（演習１）

public class Main {
    public static void main(String[] args) {
        double rand = (Math.random() * 10) + 1;
        int number = (int) rand;
        System.out.println("あなたの順位は" + number + "位です");

        boolean flag = number <= 3;
        //　ここにifを追加する
        if (flag) {                               //flag変数を使っているので、if(条件式)ではなく、flag(number <= 3)を使用
            System.out.println("入賞おめでとう");
        }
    }
}
