public class Empee {
    String name;
    String department;

    public Empee(String name,String department){
        this.name = name;
        this.department = department;
    }

    public void work() {
        System.out.println(name + "(" + department + ")正在处理日常工作");
    }

    public void introduce() {
        System.out.println("大家好，我是" + department + "的" + name);
    }
}
