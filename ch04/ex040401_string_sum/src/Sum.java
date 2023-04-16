/**
 * * 切換目錄
 * * cd ch04/ex040401_string_sum
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Sum.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Sum.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Sum
 */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (var console = new Scanner(System.in)) {
            var sum = 0;
            var number = 0;

            do {
                System.out.print("輸入數字:");
                number = Integer.parseInt(console.nextLine());
                sum += number;
            } while (number != 0);
            System.out.println("總合:" + sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}