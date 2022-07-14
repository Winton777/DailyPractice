/*
需求：
定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 */
public class Day3 {
    public static void main(String[] args) {
        System.out.println(getCode(5));
    }

    public static String getCode(int length){
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < length; i++) {
            switch((int)(Math.random()*3)){
                case 0:// 30-39 0-9 48-57
                    code.append((int) (Math.random() * 10));
                    break;
                case 1:// 41-5A A-Z 65-90
                    char a = (char)((int)(65+Math.random()*26));
                    code.append(a);
                    break;
                case 2:// 61-7A a-z 97-122
                    char b = (char)((int)(97+Math.random()*26));
                    code.append(b);
                    break;
            }
        }
        return code.toString();
    }

}
