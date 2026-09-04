public class Calculator {
    public int add(int a,int b){
        return a + b;
    }

    public int add(int a,int b,int c){
        return a + b + c;
    }

    public double add(double a,double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(1,2));
        System.out.println(calc.add(2,3,4));
        System.out.println(calc.add(2.2,3.1));
    }
}
