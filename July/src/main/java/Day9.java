import java.util.ArrayList;
import java.util.Scanner;

/*
需求：
有n个人围成一圈，顺序排号。从第一个人开始报数（从1开始报数），凡报到m的人退出圈子，留下两个人，问最后留下的是原来第几号的那位
 */
public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入人数：");
        int sum = sc.nextInt();
        System.out.println("请输入淘汰号码：");
        int killNum = sc.nextInt();
        finalPerson(sum, killNum);
    }

    public static void finalPerson(int n, int m) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int t = 0;
        while (true) {
            for (int i = 0; i < list.size(); i++) {
                t++;
                if (t == m) {
                    list.remove(i);
                    t = 0;
                    i--;
                }
            }
            if (list.size() == 2) {
                System.out.println("最后留下的人为" + list.get(0) + "号和" + list.get(1) + "号选手！");
                break;
            }
        }
    }
}
