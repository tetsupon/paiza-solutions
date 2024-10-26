// 複数行データを配列に格納する
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        
        while (sc.hasNextLine()){         //hasNextLineメソッドは入力する行がまだあるか確認する
            String data = sc.nextLine();  //行があればnextLineメソッドで行データを読み込んでいる。空の行も読み込んでくれる。
            array.add(data);              //ループの中でarrayリストにデータを追加
        }
        
        for (String str : array) {        //読み込むデータがなくなったら、ループを抜けて、まとめて中身を出力
            System.out.println(str);
        }
    }
}