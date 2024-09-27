// おみくじを作る
// 比較演算子  ==  >  <   >=  <=  !=
// 大吉  中吉  小吉  凶  大凶

public class Main {
	public static void main(String[] args) {
        int omikuji =  (int)(Math.random() * 10 + 1); //10;←の値を変更して実行できるか確認。（その後randomを使用して10の中から１つランダムに値を表示）　
        //System.out.println(omikuji);　これをデバック（正常に動作するかの確認）
        if  (omikuji == 1){
            System.out.println("大吉");
        } else if (omikuji == 2){
            System.out.println("中吉");  
        } else if (omikuji <= 4){
            System.out.println("小吉");  //3.4
        } else if (omikuji <= 7){
            System.out.println("凶");  //5.6.7
        } else {
            System.out.println("大凶"); //8.9.10
        }
	}
}