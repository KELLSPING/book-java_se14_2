/**
 * * 切換目錄
 * * cd ch03/ex030103_basic_bitwise
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Bitwise.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Bitwise.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Bitwise
 */

public class Bitwise {
    public static void main(String[] args) {
        System.out.println("AND 運算");
        System.out.printf("0 AND 0 %5d%n", 0 & 0);
        System.out.printf("0 AND 1 %5d%n", 0 & 1);
        System.out.printf("1 AND 0 %5d%n", 1 & 0);
        System.out.printf("1 AND 1 %5d%n", 1 & 1);

        System.out.println("\nOR 運算");
        System.out.printf("0 OR 0 %6d%n", 0 | 0);
        System.out.printf("0 OR 1 %6d%n", 0 | 1);
        System.out.printf("1 OR 0 %6d%n", 1 | 0);
        System.out.printf("1 OR 1 %6d%n", 1 | 1);

        System.out.println("\nXOR 運算");
        System.out.printf("0 XOR 0 %5d%n", 0 & 0);
        System.out.printf("0 XOR 1 %5d%n", 0 & 1);
        System.out.printf("1 XOR 0 %5d%n", 1 & 0);
        System.out.printf("1 XOR 1 %5d%n", 1 & 1);
    }
}
