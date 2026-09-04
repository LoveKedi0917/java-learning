public class MethodDemo {
    public static void sayHello(){
        System.out.println("你好！");
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static void printInfo(String name,int age){
        System.out.println("姓名：" + name + ",年龄：" + age);
    }

    public static void main(String[] args){
        sayHello();
        int result = add(10,20);
        System.out.println("10 + 20 = " + result);
        printInfo("张三",25);
    }
}
