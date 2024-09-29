// 条件の評価結果

public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean flag = number == 1;         //number == 1の評価結果をflag変数代入してiる。booleanは論理型を表すデータ型
        if (flag) {
            System.out.println("スキ！");    //条件式が成立した時の処理
        } else {
            System.out.println("キライ");    //条件式が成立しなかった時の処理
        }
        System.out.println(flag);            //tureやfalseを返す
    }
}