// 読み込んだ複数行を出力する(演習１)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line + "が現れた");
        }
    }
}