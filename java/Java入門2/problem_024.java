// データ型

public class Main {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10/3.0);
        
        double number1 = 3.14;              //double型（実数）3.14と表示
        System.out.println(number1);
        System.out.println((int)number1);   //実数データをint型に変換する事ができる。3.14を3と整数に変換。データ型を変換することをデータのキャストと呼ぶ
        
        int number2 = 3;                       //int型（整数）で3と表示
        System.out.println(number2);
        System.out.println((double)number2);   //double型（実数）の3.0にキャストしている
        
        String text = "123";                        //Stringで文字列として表示
        System.out.println(text);
        System.out.println(Integer.parseInt(text) * 10);    //parseIntメソッドは文字列をint型(整数)に変換する。ここで123という文字列から整数(123)に変換。*10をして整数担っているかの確認。
        System.out.println(Double.parseDouble(text) * 10);  //parseDoubleメソッドは文字列をdouble型（実数）に変換する。ここで123という文字列から実数(123.0)に変換。*10をして整数担っているかの確認。
    }
}