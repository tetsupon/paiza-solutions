// whileによる繰り返し処理3

//スライムを攻撃
//ダメージは1から10までランダム
//スライムのHPが0になるまで繰り返す

public class Main {
    public static void main(String[] args) {
        int hp = 30;    // カウンタ変数の初期化
        int hit;
        while (hp > 0) {                            //HPが0より大き場合は処理を繰り返す（ダメージを与える）
            hit = (int)(Math.random() * 10 + 1);    //hit変数の値は1から10までランダムに変化して、ダメージを与える
            System.out.println("スライムに、" + hit + "のダメージを与えた！");    // 繰り返し処理
            hp -= hit;    //i = i + 1;    // カウンタ変数の更新　　//HPから-してwhileの条件(HPが0より大きい)が続くまで処理を実行
        }
        System.out.println ("スライムを倒した");    //HPが0になるとループ処理を抜けて、この処理が実行される
    }
}


//+=	a += 1	a変数の値を1増加させる。	a = a + 1と同じ
//-=	a -= 1	a変数の値を1減少させる。	a = a - 1と同じs