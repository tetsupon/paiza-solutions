// 2次元配列を作成する

public class Main {
    public static void main(String[] args) {
        String player = "忍者";
        String[] teamA = {player , "戦士" ,"魔法使い"};
        System.out.println(teamA[0] + ", ");
        System.out.println(teamA[1] + ", ");
        System.out.println(teamA[2]);
        System.out.println("");
        System.out.println("---");
        
        String[] teamB = {teamA[0], teamA[1], teamA[2]};
        System.out.println(teamB[0] + ", ");
        System.out.println(teamB[1] + ", ");
        System.out.println(teamB[2]);
        System.out.println("");
        System.out.println("---");
        
        String[] teamC = {"勇者", "戦士", "魔法使い"};
        String[] teamD = {"盗賊", "忍者", "承認"};
        String[] teamE = {"スライム", "ドラゴン", "魔王"};
        
        String[][] teams = {teamC, teamD, teamE};
        System.out.println(teams[2][0] + ", ");
        System.out.println(teams[2][1] + ", ");
        System.out.println(teams[2][2]);
        System.out.println("");
        System.out.println("---");
        
    }
}
