class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}

public class ClassAndObject {
    public static void main(Strings[] args) {
        Calculator calc = new Calculator();

        int result=calc.add(3,7);

        System.out.println(result);
    }
}
