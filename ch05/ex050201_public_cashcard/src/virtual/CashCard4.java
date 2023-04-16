package virtual;

public class CashCard4 {
    String number;
    int balance;
    int bonus;

    public CashCard4(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    /**
     * 儲值
     * 
     * @param money
     */
    public void store(int money){
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus++;
            }
        } else {
            System.out.println("儲值是負的");
        }
    }

    /**
     * 扣款
     * 
     * @param money
     */
    public void charge(int money){
        if (money > 0) {
            if (money <= this.balance) {
                this.balance -= money;
            } else {
                System.out.println("錢不夠啦");
            }
        } else {
            System.out.println("餘額不足");
        }
    }

    /**
     * 兌換紅利
     * 
     * @param bonus
     * @return
     */
    public int exchange(int bonus){
        if (bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    public int getBalance(){
        return balance;
    }

    public int getBonus(){
        return bonus;
    }

    public String getNumber(){
        return number;
    }
}
