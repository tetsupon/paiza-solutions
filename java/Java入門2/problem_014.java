// RPGのクリティカルヒットを再現
// 比較演算子 == > < >= <= !=


// スライムと戦っている。
// 1から10のサイコロをふって、
// 6未満：サイコロの目だけダメージを与えたと表示。
// 6以上：クリティカルヒットとして、100のダメージを与えたと表示。
public class Main {
	public static void main(String[] args) {
        int hit = (int)(Math.random() * 10 + 1);
        //System.out.println(hit);    デバック用（本文の上に数値を表示させるためのもの）
        if (hit < 6){
            System.out.println("スライムに、" + hit +"のダメージを与えた！");
        } else {
            System.out.println("クリティカルヒット！スライムに、100のダメージを与えた！");
        }
	}
}