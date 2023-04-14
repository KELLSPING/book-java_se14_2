/**
 * * 切換目錄
 * * cd ch04/ex040303_copy_array
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/CopyArray.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/CopyArray.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes CopyArray
 */

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] score1 = {88,81,74,68,78,76};
        int[] score2 = Arrays.copyOf(score1, score1.length);

        for (var score : score2) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        score2[0] = 99;
        for (var score : score1) {
            System.out.printf("%3d", score);
        }
    }
}
