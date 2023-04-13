/**
 * * 切換目錄
 * * cd ch04/ex040101_classobject_field
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/Field.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/Field.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes Field
 */

class Clothes {
    String color;
    char size;
}

public class Field {
    public static void main(String[] args) {
        var sun = new Clothes();
        var spring = new Clothes();

        sun.color = "red";
        sun.size = 'S';
        spring.color = "green";
        spring.size = 'M';

        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}
