import java.util.Arrays;

/**
 * * 切換目錄
 * * cd ch04/ex040301_array_score2
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Score2.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Score2.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Score2
 */

public class Score2 {
    public static void main(String[] args) {
        var scores = new int[10];

        for (var score : scores) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        Arrays.fill(scores, 60);
        for (var score : scores) {
            System.out.printf("%3d", score);
        }
    }
}
