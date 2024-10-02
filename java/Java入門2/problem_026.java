// 税込み金額を計算する

public class Main {
    public static void main(String[] args) {
        int price = 3500;
        System.out.println("定価:" + price + "円");
        int discountPrice =(int)(price * 0.85);             //int(整数)にキャスト
        System.out.println("割引価格は、" + discountPrice + "円です。");
        int amount = (int)(discountPrice * 1.08);           //int(整数)にキャスト
        System.out.println("税込み金額は、" + amount + "円です。");
        int person = 5;
        System.out.println("人数が、" + person + "人の場合。");
        int amountPerperson = amount / person;
        System.out.println("一人当たり" + amountPerperson + "円です。" );
        int remainder = amount % person;                    //余り（%）で表示
        System.out.println("一人当たり" + amountPerperson + "円、余り" + remainder + "円です。");
    }
}