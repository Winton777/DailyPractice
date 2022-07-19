import java.util.ArrayList;
import java.util.Scanner;

/*
需求：
1、将一个正整数分解质因数。例如：输入90,打印出90=233*5。
2、一个数如果恰好等于它的真约数（不含本身）之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//=======1.=======
        System.out.println("请输入一个正整数：（分解质因数）");
        int num = sc.nextInt();
        ArrayList<Integer> list = getNumbers(num);
        if (list.size() == 0) {
            System.out.println(num + "为质数。");
        } else {
            System.out.println(num + "的质因数为：");

            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }
//=======2.=======
        System.out.println("\n请输入一个正整数：（求完数范围上限）");
        getPrefectNumbers(sc.nextInt());
    }

    /**
     * 分解质因数
     */
    public static ArrayList<Integer> getNumbers(int a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = a;
        for (int i = 2; i <= a / 2; i++) {
            if (temp % i == 0) {
                list.add(i);
                temp = temp / i;
                i--;
            }
        }
        return list;
    }

    /**
     * 求完数
     */
    public static void getPrefectNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    list.add(j);
                }
            }
            for (Integer integer : list) {
                sum += integer;
            }
            if (i == sum) {
                System.out.println(i + " ");
            }
        }
    }
}
