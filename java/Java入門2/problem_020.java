// 複数の条件を組み合わせる - OR

public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        if (number1 == 1 || number2 == 1){   // OR（||）条件1と条件2の一方でも成立したとき、全体の条件が成立
            System.out.println("スキ！");  //条件式が成立した時の処理
        } else {
            System.out.println("キライ");  //条件式が成立しなかった時の処理
        }
        
        double rand = Math.random() * 100 + 1;
        int number3 = (int)rand;
       // int number3 = 1;     デバック用
        System.out.println(number3);
        if (number3 <= 30 || number3 >= 60){
            System.out.println("あたり");
        } else {
            System.out.println("残念！");
        }
    }
}