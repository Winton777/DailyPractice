import java.util.ArrayList;
import java.util.Iterator;

/*
需求：
判断101-200之间有多少个素数，并输出所有素数。 素数：如果除了1和它本身以外，不能被其他正整数整除，就叫素数。
 */
public class Day2 {
    public static void main(String[] args) {
        ArrayList<Integer> su = new ArrayList<Integer>();
        for (int num = 101; num <= 200; num++) {
//            int index = 0;修改点：一旦整除就可以确定不是素数，就可以break了
            boolean isSu = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
//                    index++;
                    isSu = false;
                    break;
                }
            }
//            if (index == 1) {
            if(isSu){
                su.add(num);
            }
        }
        Iterator<Integer> i = su.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }
}

