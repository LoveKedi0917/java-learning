public class Test {
    public static void main(String[] args) {
        Empee emp = new Empee("张三","行政部");
        Manager mgr = new Manager("李四","技术部",20);

        emp.introduce();
        emp.work();

        mgr.introduce();
        mgr.work();
        mgr.approve();
    }
}
