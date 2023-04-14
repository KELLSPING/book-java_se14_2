/**
 * * 切換目錄
 * * cd ch04/ex040303_shallow_copy
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/ShallowCopy.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/ShallowCopy.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes ShallowCopy
 */

class Clothes {
    String color;
    char size;

    Clothes(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        Clothes[] c1 = {
                new Clothes("red", 'L'),
                new Clothes("blue", 'M')
        };

        var c2 = new Clothes[c1.length];

        for (var i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }

        c1[0].color = "yellow";
        System.out.println(c2[0].color);
        System.out.println(c2[0].size);

        c2[1].color = "black";
        System.out.println(c1[1].color);
        System.out.println(c1[1].size);
    }
}
