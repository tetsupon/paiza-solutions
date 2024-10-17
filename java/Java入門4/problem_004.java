// 変数で、配列に代入する(演習３)

public class Main {
    public static void main(String[] args) {
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        String player_3 = "戦士";
        // player_1 ~ 3を、配列に代入して、printlnメソッドで出力してください。
        
        String[] team = {player_1, player_2, player_3};
        System.out.println(team[0]);
        System.out.println(team[1]);
        System.out.println(team[2]);
    }
}