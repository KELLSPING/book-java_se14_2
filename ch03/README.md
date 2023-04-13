# Chapter 03 -- 基礎語法 #

## 學習目標 ##

* 認識型態與變數
* 學習運算子基本使用
* 了解型態轉換細節
* 運用基本流程與法
* 使用 jshell

## 小節 ##

* [3.1 型態、變數與運算子](#31-型態變數與運算子)
* [3.2 流程控制](#32-流程控制)
* [3.3 重點複習](#33-重點複習)

## 3.1 型態、變數與運算子 ##

### 3.1.1 型態 ###

* Java 兩大型態系統
  * 基本型態 (Primitive type)
  * 類別型態 (Class type)，亦稱參考型態 (Reference type)

* 基本型態 (Primitive type)
  * 整數
    * short: 佔 2 個位元組
    * int: 佔 4 個位元組
    * long: 佔 8 個位元組
  * 位元組
    * byte: 佔 1 個位元組
  * 浮點數
    * float: 佔 4 個位元組
    * double: 佔 8 個位元組
  * 字元
    * char: 佔 2 個位元組
    * Java 支援 Unicode
    * 可以用來儲存 UTF-16 Big Endian 的一個碼元 (code unit)
    * 只要知道英文或中文字元，可以直接在''以 char 儲存
    * 可以把 65535 以內的整數指定給 char，相當於指定字元的碼點 (code point)
  * 布林
    * boolean 可表示 true 與 false
    * 不用在意長度，因為無法將 boolean 與其他型態做運算

* 常用格式控制符號
  * %n: 輸出平台特定的換行符號
    * Windows 下會置換為 "\r\n"
    * Linux 下會置換為 "\n"
    * MacOS 下會置換為 "\r"

### 3.1.2 變數 (Variable) ###

* 基本規則
  * 不可以使用數字和特殊字元開頭
  * 變數名稱不能與 Java 關鍵字 (Keyword) 同名
  * 變數名稱不能與 Java 保留字 (Reversed word) 同名
  * 命名慣例 (Naming conventrion)
    * 駝峰式 (Camel case)
  * final

* 字面常量
  * 字面常數 (Literal constant)
  * 忽略 (Escape) 符號: '\'
  * 常用忽略符號
    * \\: 反斜線\
    * \': 單引號'
    * \n: 換行

* 字面常量表示法
  * Java SE 7 開始，撰寫整數或浮點數字面常量時，可以使用底線清楚地表示
    * int number1 = 1234_5678;
    * int mask = 0b1010_1010_1010;

### 3.1.3 運算子 (Operator) ###

* 運算子的兩邊各留一個空白，以方便閱讀

* 算數運算
  * 算數運算子: +, -, *, /, %

* 比較、條件運算
  * 比較運算子 (Comparison operator): >, >=, <, <=, ==, !=
  * 條件運算子 (Conditional operator)

* 邏輯運算
  * 邏輯運算子 (Logical operator): &&, ||, !
    * && 與 || 具有捷徑運算 (Short-Circuit Evaluation)

* 位元運算
  * 位元運算子 (Bitwise operator): &, |, ^,  ~

* 左移右移運算子: <<, >>
  * \>>>: 在右移後，最左邊一定是補0。

* 遞增、遞減運算: ++, --
  * i++ 較 i = i + 1 更簡潔，效率上一樣

* 指定運算
  * 指定運算子: +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=

### 3.1.4 掌握型態 ###

* 型態轉換
  * 型態不符 (Type mismatch)
  * 程式中，寫下浮點數時，編譯器 (javac) 預設會使用 double 型態。
    * float PI = 3.14; // cannot convert from double to float
      1. float PI = 3.14F;
      2. float PI = (float) 3.14; // 使用 cast
  * 程式中，寫下一個整數時，預設部會使用超過 int 型態的長度。
    * int number = 2147483648; // out of range
      * long number = 2147483648; // out of range
      * long number = 2147483648L;
  * 運算時，以長度最長的型態為主，其他數值自動提升 (Promote) 型態。
  * 若運算元都是不大於 int 的整數，自動全部提升為 int 型態進行運算。
    * short a = 1; short b = 2;
      * short c = a + b; // cannot convert from int to short

* var 型態推斷
  * 從 Java SE 10 開始，若編譯器可以從前後文推斷出區域變數型態，可以使用 var 宣告變數。

## 3.2 流程控制 ##

### 3.2.1 if..else 條件式 ###

### 3.2.2 switch 條件式 ###

* default 不一定需要，若沒有預設要處理的動作，可以省略。
* 從 Java SE 14 開始，switch 正式支援運算式形式。

### 3.2.3 for 迴圈 ###

* 無窮迴圈
  * for(;;){...}

### 3.2.4 while 迴圈 ###

* 無窮迴圈
  * while(true){...}

### 3.2.5 break, continue ###

* break: 結束區塊執行
* continue: 略過之後的陳述句，並回到迴圈區塊開頭進行下次迴圈。

## 3.3 重點複習 ##
