// 数の表示とサイコロ

public class Main {
	public static void main(String[] args) {
	    double rand = Math.random() * 100 + 1;  //100倍にした値に更に1を足す=1〜100のランダムな数字を表示。*100=何個の数から1つを選ぶのか、+1=選ばれる数値がいくつから始まるのかを指定
	    //System.out.println(rand);
		int number = (int)rand;         //double型（小数点以下の数値を扱う）のrand（変数）をint型（小数点以下を切り捨て整数型に）       
		//System.out.println(number);     //小数点以下を切り捨てた数値（整数型）をnamber（変数）に代入している
		System.out.println("スライムが" + number + "匹あらわれた");
	}