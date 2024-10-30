// ドットで文字を出力しよう(演習１)
public class Main {
    public static void main(String[] args) {

        int[][] letterA =
            {{0,0,1,1,0,0},
             {0,1,0,0,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,1},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1}};

        // ここに、ドットを表示するコードを記述する
        for (int[] line : letterA) {
            for (int dot : line) {
                if (dot == 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}