/**
 * * 切換目錄
 * * cd ch04/ex040203_classobject_auto_boxing
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/AutoBoxing.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/AutoBoxing.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes AutoBoxing
 */

public class AutoBoxing {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        Integer i5 = 150;
        Integer i6 = 150;
        Integer i7 = 50;
        Integer i8 = 50;
        Integer i9 = 200;
        Integer i10 = 200;

        if (i1 == i2) {
            System.out.println("i1 == i2");
        }else {
            System.out.println("i1 != i2");
        }

        if (i3 == i4) {
            System.out.println("i3 == i4");
        }else {
            System.out.println("i3 != i4");
        }

        if (i5 == i6) {
            System.out.println("i5 == i6");
        }else {
            System.out.println("i5 != i6");
        }

        if (i7 == i8) {
            System.out.println("i7 == i8");
        }else {
            System.out.println("i7 != i8");
        }

        if (i9 == i10) {
            System.out.println("i9 == i10");
        }else {
            System.out.println("i9 != i10");
        }
    }
}
