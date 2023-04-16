import java.util.Scanner;

/**
 * * 切換目錄
 * * cd ch05/ex050101_encapsulation2_cashcard
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/CashApp.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/CardApp.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes CashApp
 */

public class CashApp {
    public static void main(String[] args) {
        CashCard2[] cards = {
                new CashCard2("A001", 500, 0),
                new CashCard2("A002", 300, 0),
                new CashCard2("A003", 1000, 1)
        };

        try (var console = new Scanner(System.in)) {
            for (var card : cards) {
                System.out.printf("為 (%s, %d, %d) 儲值:", card.number, card.balance, card.bonus);
                card.store(console.nextInt());
                System.out.printf("明細 (%s, %d, %d) %n", card.number, card.balance, card.bonus);
            }
        }
    }
}
