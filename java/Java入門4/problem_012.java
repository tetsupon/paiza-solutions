// 拡張for文で配列を出力する

public class Main {
    public static void main(String[] args) {
        String[] team = {"勇者", "戦士", "魔法使い", "忍者"};
        
        System.out.println("<select name='job'>");                   //HTMLでプルダウン表示selectとoptionで
        for (String menber : team) {                                 //int i = 0; i < team.length; i++を変更
            System.out.println("<option>" + menber + "</option>");     //team[i]を変更
            
        }
        System.out.println("</select>");
    }
}