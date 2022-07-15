import java.util.Scanner;

/*
需求：
在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
 */
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 6;//评委人数

        int max = 0;
        int min = 0;
        int sum = 0;
        int[] score = new int[num];
        for (int i = 0; i < score.length; i++) {
            System.out.print((i+1) + " = ");
            score[i] = sc.nextInt();
            if(i == 0){
                max = score[0];
                min = score[0];
            }
            if(score[i] > max){
                max = score[i];
            }
            if(score[i] < min){
                min = score[i];
            }
            sum += score[i];
        }
        double ave = (double)(sum-max-min)/(num-2);
        System.out.println("最高分 = " + max);
        System.out.println("最低分 = " + min);
        System.out.println("平均分 = " + ave);
    }
}
