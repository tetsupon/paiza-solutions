// ArrayListに要素を追加する(演習１)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> weapon = new ArrayList<String>();
        // ここに、要素を追加するコードを記述する
        weapon.add("木の棒");      //addメソッドで要素を追加
        weapon.add("鉄の剣");
        weapon.add("石斧");
        for (String item : weapon) {
            System.out.println(item);
        }
    }
}