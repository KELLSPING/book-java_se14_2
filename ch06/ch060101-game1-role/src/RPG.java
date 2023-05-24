/**
 * * 切換目錄
 * * cd ch06/ch060101-game1-role
 * 
 * 
 * * 編譯
 * * javac -sourcepath src -cp classes -d classes src/RPG.java
 * * javac -verbose -sourcepath src -cp classes -d classes src/RPG.java
 * * -verbose: 可看到編譯器進行編譯的過程
 * 
 * 
 * * 執行
 * * java -cp classes RPG
 */

public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan(){
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.printf("劍士: (%s, %d, %d) %n", swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
    }

    static void demoMagician(){
        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.printf("魔法師: (%s, %d, %d) %n", magician.getName(), magician.getLevel(), magician.getBlood());
    }
}
