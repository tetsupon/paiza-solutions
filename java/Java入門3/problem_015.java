// HTMLによる箇条書き
public class Main {
    public static void main(String[] args) {
        System.out.println("<ul>");
        //System.out.println("<li>1</li>");
        //System.out.println("<li>2</li>");
        //System.out.println("<li>3</li>");
        for (int i = 1; i <= 100; i++){
            System.out.println("<li>" + i + "</li>");
        }
        System.out.println("</ul>");
    }
}