/**
 * * 切換目錄
 * * cd ch04/ex040301_irregular_array
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/IrregularArray.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/IrregularArray.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes IrregularArray
 */

public class IrregularArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[] { 1, 2, 3, 4, 5 };
        arr[1] = new int[] { 1, 2, 3 };
        
        for (int[] row : arr) {
            for (int value : row) {
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
}
