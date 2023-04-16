/**
 * * 切換目錄
 * * cd ch05/ex050204_class_object_initial_block
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/ObjectInitialBlock.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/ObjectInitialBlock.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes ObjectInitialBlock
 */

class Other{
    {
        System.out.println("物件初始區塊");
    }

    Other(){
        System.out.println("Other() 建構式");
    }

    Other(int o){
        this();
        System.out.println("Other(int o) 建構式");
    }
}

public class ObjectInitialBlock {
    public static void main(String[] args) {
        new Other(1);
    }
}
