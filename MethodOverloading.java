class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2, 2);

        System.out.println(result);
    }
}
