// 配列を作成する

public class Main {
    public static void main(String[] args) {
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        
        System.out.println(player_1);
        System.out.println(player_2);
        
        String[] team = {"戦士", "忍者", "100"};  //この配列はString(文字列として)なので数値にするとエラーが起きる。""で文字列にすると表示される
        System.out.println(team[0]);
        System.out.println(team[1]);
        System.out.println(team[2]);
    }
}