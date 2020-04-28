# Java 并发编程

## 0 并发编程概述

### 并发编程的三个核心问题

- 分工：任务的拆解，安排线程执行。
- 同步：被拆解的任务之间存在依赖，必须协调线程之间的关系保证程序的正确执行。
- 互斥：控制同一时刻只允许一个线程访问共享变量。



**并发编程全景图**

![](images/fullview.png)

### 钻进去，看本质

&emsp;工程上的解决方案，一定要有理论作为基础。遇到一个问题一定要刨根问底，比如“它是从哪儿来的？”，是java的特有概念还是通用的概念。“它被提出的背景和解决的问题是什么？”等等。







