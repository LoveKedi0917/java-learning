import com.google.gson.Gson;

public class MavenTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new Student("张三", 20));
        System.out.println(json);
    }
}

class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}