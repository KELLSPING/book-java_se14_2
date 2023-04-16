/**
 * * 切換目錄
 * * cd ch05/ex050101_encapsulation3_cashcard
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

public class CashApp3 {
    public static void main(String[] args) {
        var card1 = new CashCard3("A001", 500, 0);
        
        /**
         * is not visible
         */
        // System.out.printf("為 (%s, %d, %d) 儲值:", card1.number, card1.balance, card1.bonus);

        System.out.printf("明細 (%s, %d, %d)%n", card1.getNumber(), card1.getBalance(), card1.getBonus());
    }
}
