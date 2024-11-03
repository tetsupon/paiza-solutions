// 2次元配列で地図を表示する１

public class Main {
    public static void main(String[] args) {

        String[][] worldMap = new String[10][20];           //二次元配列。newキーワードの縦10,横20
        worldMap[0][0] = "城";
        worldMap[0][19] = "町";
        worldMap[9][19] = "町";

        for (int i = 0; i < worldMap.length; i++) {          //地図の各行のインデックスを指定
            System.out.print(i + ":");
            for (int j = 0; j < worldMap[i].length; j++) {   //地図の各エリアのインデックスを指定
                if (worldMap[i][j] == null) {.               //初期値が設定されていない場だけ森になるように、(配列の要素がnullかどうか判断)
                    worldMap[i][j] = "森";                   //初期値を指定
                }
                System.out.print(worldMap[i][j]);            //その結果を出力
            }
            System.out.println("");
        }
    }
}