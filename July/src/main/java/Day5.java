import java.util.*;

/*
需求：
投注号码由6个红色球和1个蓝色球号码组成。红色球（1-33）且不能重复，蓝色球（1-16）。定义一个方法返回一组中奖方法。
一等奖：中6+1，奖金1000万；二等奖：中6+0，奖金500万；三等奖：中5+1，奖金3000元；
四等奖：中5+0或4+1，奖金200元；五等奖：中4+0或3+1，奖金10元；六等奖：中2+1或1+1或0+1，奖金5元。
 */
public class Day5 {
    public static void main(String[] args) {
        ArrayList<Integer> luckyCode = getLuckyCode();
//        System.out.print("小纸条。。。");
//        printArr(luckyCode);
        System.out.println("===================买一注幸运双色球吧 (っ•̀ω•́)っ✎⁾⁾ ===================");
        ArrayList<Integer> myCode = setCode();

        System.out.println("===================\nε≡٩(๑>₃<)۶  开奖喽！\n");
        System.out.print("投注号码： ");
        printArr(myCode);
        System.out.print("中奖号码： ");
        printArr(luckyCode);

        check(myCode, luckyCode);
    }

    /**
     * 输入下注号码
     *
     * @return 下注号码
     */
    public static ArrayList<Integer> setCode() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> code = new ArrayList<Integer>();
        System.out.println("6个红球:(1-33)且不能重复");
        int temp;
        while (code.size() < 6) {
            temp = sc.nextInt();
            if (code.contains(temp)) {
                System.out.println("不能重复！");
                continue;
            }
            if (temp < 1 || temp > 33) {
                System.out.println("红球:(1-33)!");
                continue;
            }
            code.add(temp);
        }
        System.out.println("1个蓝球:(1-16)");
        while (true) {
            temp = sc.nextInt();
            if (temp > 0 && temp < 17) {
                code.add(temp);
                break;
            }
            System.out.println("蓝球:(1-16)!");
        }
        return code;
    }

    /**
     * 生成中奖号码
     *
     * @return 中奖号码
     */
    public static ArrayList<Integer> getLuckyCode() {
        ArrayList<Integer> luckyCode = new ArrayList<Integer>();
        int temp;
        while (luckyCode.size() < 6) {
            temp = (int) (1 + Math.random() * 33);
            if (!luckyCode.contains(temp)) {
                luckyCode.add(temp);
            }
        }
        luckyCode.add((int) (1 + Math.random() * 16));
        return luckyCode;
    }

    /**
     * 检查中奖情况
     *
     * @param myCode    下注号码
     * @param luckyCode 中奖号码
     */
    public static void check(ArrayList<Integer> myCode, ArrayList<Integer> luckyCode) {
        int redNum = 0;
        int blueNum = 0;
        for (int i = 0; i < myCode.size() - 1; i++) {
            if (myCode.get(i).equals(luckyCode.get(i))) {
                redNum++;
            }
        }
        if (myCode.get(myCode.size() - 1).equals(luckyCode.get(myCode.size() - 1))) {
            blueNum++;
        }
        System.out.println();
        if (redNum == 6 && blueNum == 1) {
            System.out.println("…φ(๑˃∀˂๑)♪ 恭喜，一等奖，奖金1000万元");
        } else if (redNum == 6 && blueNum == 0) {
            System.out.println("…φ(๑˃∀˂๑)♪ 恭喜，二等奖，奖金500万元");
        } else if (redNum == 5 && blueNum == 1) {
            System.out.println("…φ(๑˃∀˂๑)♪ 恭喜，三等奖，奖金3000元");
        } else if ((redNum == 5 && blueNum == 0) || (redNum == 4 && blueNum == 1)) {
            System.out.println("…φ(๑˃∀˂๑)♪ 恭喜，四等奖，奖金200元");
        } else if ((redNum == 4 && blueNum == 0) || (redNum == 3 && blueNum == 1)) {
            System.out.println("…φ(๑˃∀˂๑)♪ 恭喜，五等奖，奖金10元");
        } else if (redNum <= 2 && blueNum == 1) {
            System.out.println("…φ(๑˃∀˂๑)♪ 恭喜，六等奖，奖金5元");
        } else {
            System.out.println("没有中奖，下次一定(/\"≡_≡)/~┴┴");
        }
    }

    /**
     * 打印号码信息
     *
     * @param arr 下注号码或中奖号码
     */
    public static void printArr(ArrayList<Integer> arr) {
        System.out.print("红: ");
        for (int j = 0; j < arr.size() - 1; j++) {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println("蓝: " + arr.get(arr.size() - 1));
    }
}
