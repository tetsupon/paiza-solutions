// ループで配列を操作する

public class Main {
    public static void main(String[] args) {
        String[] team = {"勇者", "戦士", "魔法使い", "忍者"};
        //System.out.println(team[0]);
        //System.out.println(team[1]);
        //System.out.println(team[2]);
        System.out.println(team.length);  //lengthを使うと配列の要素の個数を調べることができる
        
        for (int i = 0; i < team.length; i++){     //team.lengthとする
            System.out.println(team[i]);
        }
    }
}
