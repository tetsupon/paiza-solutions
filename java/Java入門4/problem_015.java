// ArrayListを使う

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<String>();

        team.add("勇者");
        team.add("魔法使い");
        for (String member : team) {        //要素をループで出力
            System.out.println(member);
        }
        System.out.println(team.get(0));    //ArrayListから要素を取り出す場合は、getメソッドを使用
        System.out.println(team.size());    //ArrayListの長さを表すにはsizeメソッドを使用。長さを宣言しなくても柔軟に対応できる
                                            //要素の追加
        team.add("戦士");                   //上記に"戦士"という要素を追加して表示させる事ができる
        for (String menber : team){
            System.out.println(menber);
        }
        System.out.println(team.size());
                                            //要素の更新
        team.set(1, "忍者");                //setメソッドを使用
        for (String menber : team){
            System.out.println(menber);
        }
        System.out.println(team.size());
                                            //要素の削除
        team.remove(2);                     //removeメソッドを使用
        for (String menber : team){
            System.out.println(menber);
        }
        System.out.println(team.size());
    }
}
