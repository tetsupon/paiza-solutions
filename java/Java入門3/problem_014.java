// 年齢入力のプルダウン作成
public class Main {
    public static void main(String[] args) {
        System.out.println("<select name='age'>");
        //<option>1才</option>
        //<option>2才</option>
        //<option>3才</option>  同じ処理を何十回と書くことになる。
        for (int i = 1; i <= 100; i++){
            System.out.println("<option>" + i + "歳</option>");  //
        }
        System.out.println("</select>");
    }
}