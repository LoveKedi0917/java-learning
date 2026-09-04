public class Employer {
    private String name;
    private int age;
    private double salary;

    public Employer(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name;}
    public int getAge() { return age; }
    public double getSalary() { return salary;}

    public void setAge(int age){
        if (age < 18 || age > 65){
            System.out.println("年龄不合法");
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.out.println("工资不能为负数！");
            return;
        }
        this.salary = salary;
    }

    public void introduce(){
        System.out.println("姓名：" + name + ",年龄：" + age + ",工资：" + salary);
    }
}
