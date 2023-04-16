/**
 * * 切換目錄
 * * cd ch04/ex040301_array_xy
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/XY.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/XY.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes XY
 */

public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1,2,3},
            {4,5,6}
        };
        
        for (var x = 0; x < cords.length; x++) {
            for (var y = 0; y < cords[x].length; y++) {
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
}
