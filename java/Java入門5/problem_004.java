// 2次元配列の基本操作

public class Main {
    public static void main(String[] args) {
       //String[] teamA = {"勇者", "戦士", "魔法使い"};
       //String[] teamB = {"盗賊", "忍者", "商人"};
       //String[] teamC = {"スライム", "ドラゴン", "魔王"};
       
       String[][] teams = {{"勇者", "戦士", "魔法使い"}, {"盗賊", "忍者", "商人"}, {"スライム", "ドラゴン", "魔王"}};
       
       System.out.print(teams[2][0] + ", ");
       System.out.print(teams[2][1] + ", ");
       System.out.print(teams[2][2]);
       System.out.println("");
       System.out.println("---");
       
       teams[0][0] = "魔導士";                //インデックス[0][0]の要素を魔導士に変更
       System.out.print(teams[0][0] + ", ");
       System.out.print(teams[0][1] + ", ");
       //System.out.print(teams[0][2]);
       System.out.println("");
       System.out.println("---");
       
       System.out.println(teams.length);       //teams配列は要素が4個
       System.out.println(teams[0].length);    //teams配列の要素のインデックス
    }
}