/**
 * 需求：
 * 1、写一个算法对5，8，15，2，24，49，7进行升序顺序排列
 * 2、用循环控制语句打印输出：1+3+5+…….+99=？结果
 * 3、输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 4、一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次落地后反弹多高？
 */
public class Day6 {
    public static void main(String[] args) {
        math1(new int[]{8, 5, 15, 12, 24, 49, 7});
//        math2();
//        math3(8,20);
//        math4(100, 10);
    }

    //     1、写一个算法对数组进行升序顺序排列
    public static void math1(int[] arr) {
        System.out.println("原数组:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("新数组:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //     2、用循环控制语句打印输出：1+3+5+……+99=？结果
    public static void math2() {
        int sum = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            sum += i;
        }
        System.out.println("1+3+5+……+99=" + sum);
    }

    //     3、输入两个正整数m和n，求其最大公约数和最小公倍数。
    public static void math3(int m, int n) {
        int b = m > n ? m : n;
        int s = m < n ? m : n;

        int gcd = 1;//最大公约数
        for (int i = 1; i <= s; i++) {
            if (s % i == 0 & b % i == 0) {
                gcd = i;
            }
        }

        int lcm = 0;//最小公倍数
        boolean isLcm = false;
        int i = 1;
        while (!isLcm) {
            if ((s * i) % b == 0) {
                isLcm = true;
                lcm = s * i;
            }
            i += 1;
        }
        System.out.println("最大公约数 = " + gcd + "; 最小公倍数 = " + lcm);
    }

    //     4、一球从m米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第n次落地时，共经过多少米？第n次落地后反弹多高？
    public static void math4(double height, int n) {
        double sum = 0;
        double back;
        int i = 1;
        while (true) {
            sum += height;
            back = height / 2;
            if (i == n) {
                System.out.println("第" + n + "次落地时，共经过" + sum + "米；第" + n + "次落地后，反弹高" + back + "米");
                break;
            }
            i++;
            height = back;
            sum += height;
        }
    }
}
