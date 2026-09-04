public class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count <= 5){
            System.out.println("while 循环第" + count + "次");
            count ++;
        }

        int num = 1;
        do{
            System.out.println("do-while 第" + num + "次");
            num ++;
        }while (num <= 3);
    }
}
