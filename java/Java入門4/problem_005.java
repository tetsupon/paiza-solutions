// 配列の要素を取り出す

public class Main {
    public static void main(String[] args) {
        int num = 0;     //num変数に代入してもできる
        
        //String[] team = {"戦士", "忍者"};
        String[] team;         //配列の名前を宣言
        team = new String[2];  //長さ2の配列を用意してteamに代入
        team[0] = "戦士";      //配列の要素にそれぞれを代入
        team[1] = "忍者";
        
        System.out.println(team[num + 1]);  //num変数(0)+1=1なので、team[1]が選択される
        //System.out.println(team[0]);
        
        team[1] = "盗賊";            //team[1]を盗賊に更新
        System.out.println(team[1]); //team[10]など配列の範囲外を選択するとエラーが出る
    }
}
