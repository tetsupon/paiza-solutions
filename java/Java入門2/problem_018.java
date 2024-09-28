// 複数の条件を組み合わせる - AND

public class Main {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        if (number1 == 1 && number2 == 1){
            System.out.println("スキ！");  //条件式が成立した時の処理
        } else {
            System.out.println("キライ");  //条件式が成立しなかった時の処理
        }
        double rand = Math.random() * 100 + 1;
        int number3 = (int)rand;
        //int number3 = 30;　　数値を変えて確認するためのデバック
        System.out.println(number3);
        if (number3 >= 30 && number3 <= 60){    //30以上60以下の条件式に両方当てはまらないと成立しない
            System.out.println("あたり");
        } else {
            System.out.println("残念！");
        }
    }
}