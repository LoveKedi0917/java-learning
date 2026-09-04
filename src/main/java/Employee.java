public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary =salary;
    }

    public void work(){
        System.out.println(this.name + "正在工作");
    }

    public void introduce(){
        System.out.println("我叫" + name + ",今年" + age + "岁，工资：" + salary);
    }
}


