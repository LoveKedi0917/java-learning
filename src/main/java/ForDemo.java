public class ForDemo {
    public static void main(String[] args){
        for (int i = 1; i <= 10;i++){
            System.out.println("第" + i + "次");
        }

        int sum = 0;
        for (int i = 1;i <= 100; i++){
            sum +=i;
        }
        System.out.println("1到100的和：" + sum);
    }
}
