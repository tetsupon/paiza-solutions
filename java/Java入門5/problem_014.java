ドット絵を表示する

public class Main {
    public static void main(String[] args) {

        int[][] enemyImage =
            {{0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0},
             {0,0,0,1,0,1,0,0,0,0,1,1,1,0,0,0},
             {0,0,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
             {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}};
             
         for (int[] line: enemyImage) {      //enemyImage配列の各行を取り出す配列ができた
             for (int dot : line) {
                 if (dot == 1) {             //dot絵をif文を使って表示
                     System.out.print("#");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println("");         //ループを抜けたところで改行
         }    

    }
}