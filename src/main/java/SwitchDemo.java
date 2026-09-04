public class SwitchDemo {
    public static void main(String[] args){
        String day = "周三";

        switch (day){
            case "周一":
                System.out.println("新的一周开始了");
                break;
            case "周三":
                System.out.println("周中，继续加油！");
                break;
            case "周五":
                System.out.println("快到周末了");
                break;
            default:
                System.out.println("普通的一天");
        }
    }
}
