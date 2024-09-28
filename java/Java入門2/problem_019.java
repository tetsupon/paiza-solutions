// 順位に合わせてメッセージを表示する（演習１）

public class Main {
    public static void main(String[] args) {
        double rand = (Math.random() * 10) + 1;
        int number = (int) rand;
        System.out.println("あなたの順位は" + number + "位です");

        //　ここにifを追加する
        if (number >= 2 && number <=5 ){             //2位以上、5位以下の時の条件式（）&&を使って２つの条件が成立しts時の実行
            System.out.println("あと少し");
        } else if (number == 1 ) {                   //1位の時の条件式
            System.out.println("あなたの順位は" + number + "位です");
        } else {                                     //上記以外（6〜10位）の時の条件式
            System.out.println("あなたの順位は" + number + "位です");
        }
    }    
}