// ArrayListの要素の個数を出力する(演習４)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> weapon =  new ArrayList<String>();
        weapon.add("木の棒");
        weapon.add("鉄の棒");
        weapon.add("鉄の剣");
        weapon.add("石斧");
        weapon.add("エクスカリバー");
        // ここに、要素数を出力するコードを記述する
        System.out.println(weapon.size());       //要素の数を表示はsetメソッドを使用
    }
}