/**
 * * 切換目錄
 * * cd ch05/ex050208_class_call_by_value
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/CallByValue.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/CallByValue.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes CallByValue
 */

public class CallByValue{
    public static void main(String[] args) {
        var c1 = new Customer("Justin");
        some(c1);
        System.out.println(c1.name);

        var c2 = new Customer("Justin");
        other(c2);
        System.out.println(c2.name);

        System.out.println(c1 == c2);
    }

    static void some(Customer c){
        c.name = "John";
    }

    static void other(Customer c){
        c = new Customer("Bill");
    }
}

class Customer{
    String name;
    Customer(String name){
        this.name = name;
    }
}