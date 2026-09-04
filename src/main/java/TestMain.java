public class TestMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("张三",25,8000);
        Employee emp2 = new Employee("李四",30,12000);

        Employer emp = new Employer("张三",25,800);

        emp.setAge(150);
        emp.setSalary(-200);
        emp.introduce();

    }
}
