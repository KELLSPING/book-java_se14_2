/**
 * * 編譯
 * * javac -verbose -sourcepath src -d classes src/Main.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Main
 */

package utils;

public class Console {
    public static void writeLine(String text) {
        System.out.println(text);
    }
}
