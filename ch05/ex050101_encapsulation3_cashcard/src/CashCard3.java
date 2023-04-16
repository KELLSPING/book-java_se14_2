public class CashCard3 {
    private String number;
    private int balance;
    private int bonus;

    CashCard3(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    /**
     * 儲值
     * 
     * @param money
     */
    void store(int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus++;
            }
        } else {
            System.out.println("儲值是負的");
        }
    }

    int getBalance(){
        return balance;
    }

    int getBonus(){
        return bonus;
    }

    String getNumber(){
        return number;
    }
}
