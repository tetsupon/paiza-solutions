//文字列の一致を判定//

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    //標準入力から受け取った文字列を(scan = 入力値)
        String name = scan.next();                //scan(入力値)を変数(name)に代入
        System.out.println("Hello " + name);      //Helloという文字列と連結して
        
        if (name.equals("Java")){                  //入力値(name)がJavaの場合
            System.out.println("Welcome");         //("Hello " + name)のHello Java Welcomeと出力
        }else if (name.equals("JAVA")){            //入力値(name)がJAVAの場合
            System.out.println("Goog morning");    //("Hello " + name)のHello JAVA Good ,morningと出力
        }else {                                    //それ以外(例：paiza)
            System.out.println("Goodbye");         //paiza Goodbyeと出力
        }
    }