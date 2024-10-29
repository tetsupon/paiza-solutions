// 2次元配列をnewで作成する

public class Main {
    public static void main(String[] args) {
        int[] numberA = new int[10];     //{0,1,2,3,4};   //intはデータ型、Stringは文字列
        for (int i = 0; i < numberA.length; i++){
            numberA[i] = i;
            System.out.print(numberA[i] + " ");
        }
        System.out.println("");
        System.out.println(numberA.length);    //numberA配列の長さが10になっている
        System.out.println("===");
        
        
        int[][] numberB = new int[3][4];   //縦3行、横4列の二次元配列
        for (int i = 0; i < numberB.length; i++){
            for (int j = 0; j < numberB[i].length; j++){
                numberB[i][j] = i * 10 + j;
                System.out.print(numberB[i][j] + " ");
            }
            System.out.println("");
            System.out.println("---");
        }
    }
}