// 複数行のカンマ区切りデータを出力する(演習２)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // ここに、文字列を分割して、出力するコードを書く
            String[] enemy = line.split(",");
            System.out.println(enemy[0] + "が" + enemy[1] + "匹現れた");
        }
    }
}