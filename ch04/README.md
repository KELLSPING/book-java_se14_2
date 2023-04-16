# Chapter 04 -- 認識物件 #

## 學習目標 ##

* 區分基本型態與類別型態
* 了解物件與參考的關係
* 從包裹器認識物件
* 以物件觀點看待陣列
* 認識字串的特性
* 知道如何查詢 API 文件

## 小節 ##

* [4.1 類別與實例](#41-類別與實例)
* [4.2 基本型態包裹器](#42-基本型態包裹器)
* [4.3 陣列物件](#43-陣列物件)
* [4.4 字串物件](#44-字串物件)
* [4.5 查詢 Java API 文件](#45-查詢-java-api-文件)
* [4.6 重點複習](#46-重點複習)

## 4.1 類別與實例 ##

* 類別 (Class) 與 物件 (Object)
  * class 是 object 的設計圖
  * object 是 class 的實例 (instance)
  * 要產生 object，必須先定義 class

### 4.1.1 定義類別 ###

* 使用 new 關鍵字，建立 class 的實例
* 宣告參考名稱 (reference name)、參考變數 (reference variable) 或直接叫參考 (reference)
  * Clothes c1 = new Clothes();
    * 以 Java 術語來說，稱 c1 參考 (refer) 至新建物件 。
* 只要有一個類別定義，編譯器 (javac) 就會產生一個 .class 檔案。
* 若想在建立物件時，一併進行初始流程，可以定義建構式 (Constructor)
  * Constructor 是與 class 名稱同名的方法 (method)
  * 使用 Constructor 建立物件
  * this 關鍵字

### 4.1.2 使用標準類別 ###

* 使用 java.util.Scanner
  * 以 int 型態傳回讀入的字元編碼
  * 在建立 Scanner 實例時，必須傳入 java.io.InputStream 的實例
    * var console = new Scanner(System.in);
    * System.in 就是一種 InputStream，可以在建構 Scanner 實例時使用。
  * Scanner 對應的 nextXXX() 方法
    * nextInt()
    * nextByte()
    * next()
    * nextLine()

* 使用 java.math.BigDecimal
  * Java 遵循 IEEE 754 浮點數演算 (Floating-point arithmetic) 規範，使用分數與指數來表示浮點數。
    * 0.5 = 1/2
    * 0.75 = 1/2 + 1/4
    * 0.1 = 1/16 + 1/32 + ... + 1/4096 + 1/8192 + ...
  * 如果要求精確度，就要小心使用浮點數，並且不要使用 == 比較浮點數運算結果。
  * 運算方法: add(), subtract(), multiply(), divide(), equals()

### 4.1.3 物件指定與相等性 ###

* Java 並非完全的物件導向程式語言。
* 在 Java 中，有兩大系統，基本型態與物件型態，必須區分 = 與 == 運算用於基本型態與類別型態的不同。
* 操作物件
  * = 用在指定名稱參考至某個物件
    * 將某個名牌綁到某個物件
  * == 用在比較兩個名稱是否參考至同一物件
    * 比較兩個名牌是否綁到同一物件
  * equals() 物件實際上內涵值是否相同
* 從記憶體的實際運作來看，= 與 == 並沒有用在基本型態與物件型態的不同。

## 4.2 基本型態包裹器 ##

### 4.2.1 包裹器基本型態 ###

* 使用基本型態目的在於效率；更多時候，使用類別建立實例，因為可以攜帶更多資訊。

### 4.2.2 自動裝箱、拆箱 ###

* J2SE 5.0 以前，須使用 Integer, Long, Double, Float, Boolean 等類別包裹為物件。
  * var wrapper1 = new Integer(10); // 從 Java SE 9 開始，基本型態包裹器的建構式都標示為棄用 (deprecated) 了
  * var wrapper1 = Integer.valueOf(data1);
* J2SE 5.0 以後，提供自動裝箱 (Auto boxing) 功能來包裹基本型態
  * Integer data1 = 10;
* Number number = 3.14f;
  * 3.14f 會先被自動裝箱為 Float，然後指定給 number。
* J2SE 5.0 以後，也可以自動拆箱 (Auto unboxing)

### 4.2.3 自動裝箱、拆箱內幕 ###

* 自動裝箱與拆箱的功能是編譯器蜜糖 (Compiler sugar)，實際上會使用 Integer.valueOf() 來建立 Integer 實例。
* 如果傳入的 int 在 IntegerCache.low (預設為 -128) 與 IntegerCache.high (預設為 127) 之間，則直接傳回，否則就使用 new 建構新的 Integer 實例。
* IntegerCache.high 可以於啟動 JVM 時，使用系統屬性來指定
  * 將 IntegerCache.high 更改為 300
    * java -D java.lang.Integer.IntegerCache.high=300 AutoBoxing

## 4.3 陣列物件 ##

* 陣列在 Java 中，就是物件

### 4.3.1 陣列物件 ###

* 宣告陣列
  * Java
    * int[] scores = {};
    * int scores[] = {}; // 也可以，但不建議
  * C/C++
    * int scores[] = {};

* Java 的陣列是物件，可以使用 length 術性取得陣列長度
  * Java
    * int len = scores.length;
  * C/C++
    * size_t len = sizeof(arr) / sizeof(arr[0]);

### 4.3.2 操作陣列物件 ###

* 陣列元素初始值
  * byte, short, int: 0
  * long: 0L
  * float: 0.0F
  * double: 0.0D
  * char: \u0000
  * boolean: false
  * class: null

* 使用 java.util.Arrays 的 fill() 方法，設定陣列的元素值。
  * Arrays.fill(arr, 10);

* 建立陣列物件的類別定義，是由 JVM 動態產生。

* 實際上，Java 的多維陣列，是由一維陣列實現，

* int[][] arr = new int \[2][];
  * arr 參考的物件會有兩個索引，但參考至 null。

### 4.3.3 陣列複製 ###

* 使用 JDK6 以上，可以使用 Arrays.copyOf() 方法，不用另行建立新陣列，它會幫忙建立。
* Java 的陣列一旦建立，長度就固定了。
* 淺層複製 (Shallow copy)
  * System.arraycopy() 和 Arrays.copyOf() 用在類別型態宣告的陣列時，都是淺層複製。
  * 術語上來說，這叫做複製參考，並沒有複製整個物件。
* 深層複製 (Deep copy)
  * A 各索引參考的物件會被複製，分別指定給 B 各索引位置。

## 4.4 字串物件 ##

* 在 Java 中，字串代表一組字元，是 java.lang.String 類別的實例

### 4.4.1 字串基礎 ###

* 使用 length() 取得字串物件管理的 char 數量
* 使用 charAt() 指定取得字串中的某個 char
* toUpperCase()
* 陣列與字串轉換
  * 將 char[] 陣列，透過 new 來建構 String 實例
    * String name = new String(char_arr);
  * 使用 String 的 toCharArray() 方法，將字串以 char[] 陣列回傳
    * char[] ch = str1.toCharArray();
* 將字串剖析為基本型態
  * Byte.parseByte(str_number)
  * Integer.parseShort(str_number)
  * Float.parseFloat(str_number)
  * ...
* 命令列引數 (Command line arguments)

### 4.4.2 字串特性 ###

* Java 字串須注意的特性
  * 字串常量與字串持
  * 不可變動 (Immutable) 字串

* 字串常量 (String literal) 與字串池 (String pool)
  * 以 "" 包括住的字串，只要內容(序列、大小寫相同)，JVM 只會建立一個 String 實例，並在字串池中維護。
  * 以 "" 寫下的字串稱為字串常量，代表是固定的字串內容。

* 不可變動字串
  * 在 Java 中，字串一旦建立，就無法更動任何內容。
  * 使用 + 串接字串，會變成建立 java.lang.StringBuilder 實例。

* StringBuilder 與 StringBuffer
  * java.lang.StringBuilder
    * 是 JDK5 開始新增的類別，在單機非多執行緒 (Multithread) 情況下，使用 StringBuilder 會有較好的效率，因為 StringBuilder 不處理同步問題
  * java.lang.StringBuffer
    * 會處理同步問題，在多執行緒環境下建議使用 StringBuffer，讓物件自行管理同步問題

### 4.4.3 原始碼檔案 ###

* 正體中文 Windows
  * Windows 10 Build 1903 更新以前，預設的純文字編譯器會使用 MS950 (相容於 Big5) 編碼。
  * Windows 10 Build 1903 更新以後，預設的純文字編譯器會使用 UTF-8 編碼。

* 使用指定的編碼器
  * javac -encoding UTF-8 Main.java

* 產生的 .class 檔案，使用反組譯工具還原程式碼

### 4.4.4 Java 與 Unicode ###

* Unicode 與 UTF
  * 字元集是一組符號的集合，字元編碼是字元實際儲存時的位元組格式。
  * 碼點 (code point)
  * 碼元 (code unit)
  * UTF-8, UTF-16

* char 與 String
  * JVM 在執行時期，對於 \uxxxx 採用的實作是 UTF-16 Big Endian，也就是記憶體中會使用兩個位元組，也就是一個碼元來儲存。

## 4.5 查詢 Java API 文件 ##

## 4.6 重點複習 ##
