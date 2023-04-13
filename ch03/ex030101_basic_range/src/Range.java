/**
 * * 切換目錄
 * * cd ch03/ex030101_basic_range
 * 
 * 
 * * 編譯
 * * javac -verbose -sourcepath src -d classes src/Range.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Main
 */

public class Range{
    public static void main(String[] args) {
        // byte, short, integer, long 範圍
        System.out.printf("byte: %d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short: %d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("integer: %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long: %d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        // float, double 精度範圍
        System.out.printf("float: %d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("double: %d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        // char 可表示的 Unicode 範圍
        System.out.printf("char: %h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);
        // boolean 的兩個值
        System.out.printf("boolean: %b ~ %b%n", Boolean.TRUE, Boolean.FALSE);
    }
}