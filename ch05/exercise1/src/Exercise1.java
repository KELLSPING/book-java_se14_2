
/**
 * * 切換目錄
 * * cd ch05/exercise1
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Exercise1.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Exercise1.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Exercise1
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("請輸入盤數：");
        move(new Scanner(System.in).nextInt(), 'A', 'B', 'C');
    }

    static void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.printf("盤由 %c 移至 %c%n", a, c);
        } else {
            move(n - 1, a, c, b);
            move(1, a, b, c);
            move(n - 1, b, a, c);
        }
    }
}
