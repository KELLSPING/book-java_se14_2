/**
 * * 切換目錄
 * * cd ch04/ex040102_classobject_decimal_demo
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/DecimalDemo.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/DecimalDemo.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes DecimalDemo
 */

import java.math.BigDecimal;

public class DecimalDemo {
    public static void main(String[] args) {
        var operand1 = new BigDecimal("1.0");
        var operand2 = new BigDecimal("0.8");

        var result = operand1.subtract(operand2);
        System.out.print("1.0 - 0.8 = ");
        System.out.println(result);
    }
}
