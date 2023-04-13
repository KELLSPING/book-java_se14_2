/**
 * * 編譯
 * * javac -verbose -sourcepath src -d classes src/Main.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Main
 */

import utils.Console;

public class Main {
    public static void main(String[] args) {
        Console.writeLine("Hello, ex020101");
    }
}