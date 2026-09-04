public class DataTypePractice {
    public static void main(String[] args){
        int age = 25;
        double salary = 8500.50;
        boolean isEmployed = true;
        char grade = 'A';

        int a = 10, b = 3;
        System.out.println("加法：" + (a+b));
        System.out.println("取余：" + (a%b));
        System.out.println("比较：" + (a > b));
        System.out.println("逻辑与" + (a>5 && b<5));

        Integer num = 100;
        String str = num.toString();
        System.out.println("字符串：" + str);
    }
}
