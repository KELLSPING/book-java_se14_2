
/**
 * * 切換目錄
 * * cd ch04/ex040102_classobject_decimal_demo2
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/DecimalDemo2.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/DecimalDemo2.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes DecimalDemo2
 */

import java.math.BigDecimal;

public class DecimalDemo2 {
    public static void main(String[] args) {
        var op1 = new BigDecimal("0.1");
        var op2 = new BigDecimal("0.1");
        var op3 = new BigDecimal("0.1");
        var result = new BigDecimal("0.3");

        if (op1.add(op2).add(op3).equals(result)) {
            System.out.println("等於 0.3");
        } else {
            System.out.println("不等於 0.3");
        }
    }
}