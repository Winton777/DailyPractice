import java.util.Scanner;

/*
需求：
机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 */
public class Day1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double fee = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("输入机票原价：");
            double oriFee = myScanner.nextDouble();
            System.out.println("输入航班月份：");
            int month = myScanner.nextInt();
            System.out.println("输入机舱类型（头等舱或经济舱）：");
            String type = myScanner.next();
            switch (month) {
                case 11: case 12: case 1: case 2: case 3: case 4:
                    if (type.equals("头等舱")) {
                        fee = oriFee * 0.7;
                        flag = true;
                        break;
                    } else if (type.equals("经济舱")) {
                        fee = oriFee * 0.65;
                        flag = true;
                        break;
                    } else {
                        System.out.println("机舱类型输入错误，请重试。");
                        break;
                    }
                case 5: case 6: case 7: case 8: case 9: case 10:
                    if (type.equals("头等舱")) {
                        fee = oriFee * 0.9;
                        flag = true;
                        break;
                    } else if (type.equals("经济舱")) {
                        fee = oriFee * 0.85;
                        flag = true;
                        break;
                    } else {
                        System.out.println("机舱类型输入错误，请重试。");
                        break;
                    }
                default:
                    System.out.println("月份输入错误，请重试。");
            }
        }
        System.out.println("票价为：" + fee + "\n购票中...");
        System.out.println("购票完成！(っ•̀ω•́)っ□⁾⁾ ");
    }
}
