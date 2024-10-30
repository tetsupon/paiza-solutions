// 2次元配列の初期値を指定しよう(演習２)
public class Main {
    public static void main(String[] args) {

        int[][] array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0;  j < array[i].length; j++) {
                //この下で、初期値を指定する
                array[i][j] = 1;
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
