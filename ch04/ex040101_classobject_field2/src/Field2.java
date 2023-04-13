/**
 * * 切換目錄
 * * cd ch04/ex040101_classobject_field2
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Field2.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Field2.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Field2
 */

class Clothes2 {
    String color;
    char size;

    Clothes2(String color, char size){
        this.color = color;
        this.size = size;
    }
}

public class Field2 {
    public static void main(String[] args) {
        var sun = new Clothes2("red", 'S');
        var spring = new Clothes2("green", 'M');

        System.out.printf("sun [%s, %c]%n", sun.color, sun.size);
        System.out.printf("spring [%s, %c]%n", spring.color, spring.size);
    }
}
