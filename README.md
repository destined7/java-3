JAVA实验报告

班级：计G191
姓名 : 周政
学号：201932043






实验目的:

掌握字符串String及其方法的使用
掌握异常处理结构

要求：

1.利用已学的字符串处理知识编程完成《长恨歌》的整理对齐
2.写出相应功能函数
3.每7个汉字加一个标点符，奇数时加“，”偶数时加“。”
4.允许输入参数，统计古诗中某个字或词的出现次数
5.设计异常处理程序


实验过程：

调用main中的args数组
String声明新的数组str=args【0】
用for循环实现7字加标点的功能
用求余数判断是偶数还是奇数（每7个字判断1次末尾的标点）
创建一个countString（string str，string s）方法用来计算字出现的次数
用indexOf来从首次出现的字开始累计
调用countString方法
使用try{}catch添加异常处理

运行结果




实验流程图：





核心代码：

                          public static void countString(String str,String s){
                                  int	count = 0;
                                        for(int i=0;i<str.length();i++){
                                  if(str.indexOf(s,i)==i){
                                  count++;
                                }
                              }
                              System.out.println(s+"  出现了   "+count+" 次");

运行截图：


编程感想：

基本掌握了string的使用方法，理清楚了添加标点中的逻辑关系。
使用了substring和indexof来截取字符和从首字开始计数
使用了try catch来捕捉异常，稍微了解了throws和前者关系
只能稍微懂了一点点基础，还需要提高水平。


