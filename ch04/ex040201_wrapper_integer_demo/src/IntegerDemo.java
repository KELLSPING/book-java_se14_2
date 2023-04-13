/**
 * * 切換目錄
 * * cd ch04/ex040201_wrapper_integer_demo
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/IntegerDemo.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/IntegerDemo.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes IntegerDemo
 */

public class IntegerDemo{
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;

        // var wrapper1 = new Integer(data1);
        // var wrapper2 = new Integer(data2);

        var wrapper1 = Integer.valueOf(data1);
        var wrapper2 = Integer.valueOf(data2);

        System.out.println(data1 / 3);
        System.out.println(wrapper1.doubleValue() / 3);
        System.out.println(wrapper1.compareTo(wrapper2));
    }
}