public class PassByValue {
    public static void change(int num){
        num = 999;
    }

    public static void main(String[] args){
        int x = 10;
        change(x);
        System.out.println(x);
    }
}
