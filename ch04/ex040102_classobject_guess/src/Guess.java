/**
 * * 切換目錄
 * * cd ch04/ex040102_classobject_guess
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Guess.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Guess.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Guess
 */

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var number = (int) (Math.random() * 10);
        var guess = -1;

        do {
            System.out.print("猜數字 (0~9):");
            guess = console.nextInt();
        } while (guess != number);

        System.out.println("猜中了");
        console.close();
    }
}
