/**
 * * 切換目錄
 * * cd ch05/ex050101_encapsulation1_cashcard
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/CardApp.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/CardApp.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes CardApp
 */

public class CardApp {
    public static void main(String[] args) {
        CashCard1[] cards = {
            new CashCard1("A001", 500, 0),
            new CashCard1("A002", 300, 0),
            new CashCard1("A003", 1000, 1),
            new CashCard1("A004", 2000, 2),
            new CashCard1("A005", 3000, 3),
        };

        for (var card : cards) {
            System.out.printf("(%s, %d, %d)%n", card.number, card.balance, card.bonus);
        }
    }
}
