import java.util.ArrayList;
import java.util.Scanner;

/**
 * 需求：
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入查询月份：");
        int month = sc.nextInt();
        System.out.println(month + "月有兔子" + getNum(month) + "对。");
        System.out.println(fn(month));
    }

    public static int getNum(int month) {
        ArrayList<Rabbit> list = new ArrayList<Rabbit>();
        list.add(new Rabbit());
        Rabbit temp;
        for (int i = 1; i <= month; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getAge() >= 3) {
                    list.add(new Rabbit());
                }
                list.get(j).growUp();
            }
        }
        return list.size();
    }

    /**
     * 递归写法
     */
    private static int fn(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fn(n - 1) + fn(n - 2);
    }
}

class Rabbit {
    private int age = 1;

    public void growUp() {
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
