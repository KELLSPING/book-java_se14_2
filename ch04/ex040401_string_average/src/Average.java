/**
 * * 切換目錄
 * * cd ch04/ex040401_string_average
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Average.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Average.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Average
 * * 加入命令列引數
 * * java -cp classes Average 1 2 3 4
 */

public class Average {
    public static void main(String[] args) {
        var sum = 0;
        for (var arg : args) {
            sum += Long.parseLong(arg);
        }
        System.out.println("平均:" + (float) sum / args.length);
    }
}
