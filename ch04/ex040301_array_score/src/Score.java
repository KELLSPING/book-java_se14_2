/**
 * * 切換目錄
 * * cd ch04/ex040301_array_score
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Score.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Score.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Score
 */

public class Score {
    public static void main(String[] args) {
        int[] scores = { 88, 81, 74, 68, 78 };

        for (var i = 0; i < scores.length; i++) {
            System.out.printf("學生分數: %d %n", scores[i]);
        }
    }
}
