# JAVA练习题

## Day1

##### 买飞机票

##### 需求：

机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

##### 分析：

定义一个方法可以进行键盘录入机票原价、月份和机舱类型。使用if判断月份是是旺季还是淡季，使用switch分支判断是头等舱还是经济舱。选择对应的折扣进行计算并返回计算的结果。

##Day2

##### 找素数

##### 需求：

判断101-200之间有多少个素数，并输出所有素数。
素数：如果除了1和它本身以外，不能被其他正整数整除，就叫素数。

##### 分析：

分析101-200之间的数据可以采用循环依次拿到; 每拿到一个数，判断该数是否是素数。判断规则是：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。

##Day3

##### 开发验证码

##### 需求：

定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。

##### 分析：

定义一个方法，生成验证码返回：方法参数是位数、方法的返回值类型是String。在方法内部使用for循环生成指定位数的随机字符，并连接起来。把连接好的随机字符作为一组验证码进行返回。

##Day4

##### 评委打分

##### 需求：

在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

##### 分析：

把6个评委的分数录入到数组中，遍历数组中每个数据，进行累加求和，并找出最高分、最低分。按照分数的计算规则算出平均分。

##Day5

##### 双色球系统

##### 需求：

投注号码由6个红色球和1个蓝色球号码组成。红色球（1-33）且不能重复，蓝色球（1-16）。定义一个方法返回一组中奖方法。
一等奖：中6+1，奖金1000万；二等奖：中6+0，奖金500万；三等奖：中5+1，奖金3000元；四等奖：中5+0或4+1，奖金200元；五等奖：中4+0或3+1，奖金10元；六等奖：中2+1或1+1或0+1，奖金5元。

##### 分析：

投注号码和中奖号码都定义为Map<Integer num,String color>，遍历投注Map去中奖Map中匹配，若num和color都一致则对应颜色计数加一。按奖励规则算出中奖情况。

##Day6

##### 数学题

##### 需求：

1、写一个算法对5，8，15，2，24，49，7进行升序顺序排列

2、用循环控制语句打印输出：1+3+5+…….+99=？结果

3、输入两个正整数m和n，求其最大公约数和最小公倍数。

4、一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次落地后反弹多高？

##Day7

##### 斐波那契兔子

##### 需求：

有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？

##### 分析：

传统解法：分析 一月 1对， 2月 1对，3月 2对，4月 3对，5月5对，6月8对，7月13对，8月 21只，后一个月数为前两个月数的和；

面向对象解法：创建兔子对象，拥有年龄，每个月遍历当前兔子数组，年龄增长并判断是否繁殖

##Day8

##### 分解质因数、求完美数

##### 需求：

1、将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

2、一个数如果恰好等于它的真约数（不含本身）之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。

##Day9

##### 报数

##### 需求：

有n个人围成一圈，顺序排号。从第一个人开始报数（从1开始报数），凡报到m的人退出圈子，留下两个人，问最后留下的是原来第几号的那位
