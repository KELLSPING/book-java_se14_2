# Chapter 01 -- 認識 C 語言 #

## 學習目標 ##

* 簡介 Java 版本遷移
* 認識 Java SE, Java EE, Java ME
* 認識 JDK 規範與實作
* 了解 JVM, JRE 與 JDK
* 下載、安裝 JDK

## 小節 ##

* [1.1 Java 不只是語言](#11-java-不只是語言)
* [1.2 JVM/JRE/JDK](#12-jvmjrejdk)
* [1.3 重點複習](#13-重點複習)

## 1.1 Java 不只是語言 ##

### 1.1.1 前世今生 ###

* 原名為 Oak，後來更名為 Java。
* Java 本身會見到許多為了節省資源而做的設計，像是動態載入類別檔案、字串池 (String pool) 等特性，這是因為 Java 一開始就是為了消費性數位產品而設計，而這類小型裝置通常記憶體、運算資源有限。
* 全球資訊網 (World Wide Web) 興起，Java Applet 成為網頁互動技術代表。
* 從 J2SE 到 Java SE
  * Java 2 Platform 簡稱 J2SE 1.2
  * Java 開發者版本一開始是以 Java Development Kit 名稱發表，簡生 JDK。
  * J2SE 是平台名稱，包含了 JDK 與 Java 程式語言。
  * 2006/12/11 發表的 Java 平台標準版，稱為 Java Platform, Standard Edition 6，簡稱 Java SE 6。JDK6 全名為 Java SE Development Kit 6。
  * LTS 版本: Java SE 8, Java SE 11, Java SE 17

### 1.1.2 三大平台 ###

* Java 體系架構根據不同級別的應用開發，區分了不同的應用版本:
  * J2SE (Java 2 Platform, Standard Edition)
  * JSEE (Java 2 Platform, Enterprise Edition)
  * J2ME (Java 2 Platform, Micro Edition)
* Java SE 6 後，Java 不再帶有"2"這個號碼，分別被正名為 Java SE, JavaEE 與 Java ME。
* Java SE 分為 4 個主要部分
  1. Java 虛擬機 (Java Virtual Machine, JVM)
  2. Java 執行環境 (Java SE Runtime Enviroment, JRE)
  3. JDK (Java SE Development Kits, JDK)
  4. Java 語言

<div style="text-align:center">
    <img src="img/01_02-Java SE 的組成概念圖.jpg" alt= “01_02-Java SE 的組成概念圖” width="70%">
    <p>Java SE 的組成概念圖</p>
</div>

### 1.1.3 JCP 與 JSR ###

* JCP (Java Community Process)
* JSR (Java Specofocation Requests)

### 1.1.4 Oracle JDK 與 OpenJDK ###

* Sun JDK 採用 JRL: 原始碼可用於個人研究使用，但禁止任何商業用途。
* OpenJDK7 採 GPL2 with the Classpath Exception: 允許商業上的使用。
* Java SE 9 以後開始支援模組化。
* 建議採用 Java SE 11。

### 1.1.5 建議的學習路徑 ###

* JVM 是 Java 程式唯一認識的作業系統，其可執行檔為 .class 檔案。
* PATH 與 CLASSPATH
* 理解封裝、繼承、多型
* 掌握常用 Java SE API 架構
* 學習容器觀念
* 研究開放原始碼
* 學習模式與重構
  * 模式 (pattern): 流傳下來的設計經驗
  * 重構 (refactor): 流傳下來的調整手法
* 熟系相關開發工具

## 1.2 JVM/JRE/JDK ##

<div style="text-align:center">
    <img src="img/01_07-Java SE 元件概念圖.jpg" alt= “01_07-Java SE 元件概念圖” width="70%">
    <p>Java SE 元件概念圖</p>
</div>

### 1.2.1 什麼是 JVM ###

* Java 原始碼附檔名為 \*.java ，經過 javac 編譯器翻譯為 *.class 的位元碼 (bytes code)。
  * 位元碼檔案就是 JVM 的可執行檔。
* 不同的平台必須安裝專屬該平台的 JVM。
* JVM 會將位元碼翻譯為相依於平台的機器碼。

<div style="text-align:center">
    <img src="img/01_10-位元碼可執行於具備 JVM 的系統.jpg" alt= “01_10-位元碼可執行於具備 JVM 的系統” width="60%">
    <p>位元碼可執行於具備 JVM 的系統</p>
</div>

### 1.2.2 JRE 與 JDK ###

* JRE 就是 Java 執行環境，包括了 Java SE API、JVM 與 部署技術。
* JDK 包括了 Java 程式語言、工具程式 (javac, java, javadoc) 與 JRE。
* 新版本的 Oracle JDK 或 OpenJDK 都不再提供獨立的 JRE 安裝或下載了，想執行 Java 程式，就是使用 JDK。

## 1.3 重點複習 ##
