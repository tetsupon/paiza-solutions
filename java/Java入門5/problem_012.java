// 2次元配列をnewで作成しよう(演習１)
public class Main {
    public static void main(String[] args) {

        // この下で、配列を作成しよう

        int[][] array = new int[2][3];
        for (int[] item : array) {
            for (int num : item) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}