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

## 4.4 字串物件 ##

## 4.5 查詢 Java API 文件 ##

## 4.6 重點複習 ##
