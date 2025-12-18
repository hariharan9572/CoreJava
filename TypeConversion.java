public class TypeConversion {
    public static void main(Strings[] args) {
        byte b = 127;
        int a = 12;

        a = b; // Conversion
        // b = a; wrong 
        b = (byte) a; // Explict Casting

        float f = 12.5f;
        int x = (int)f;  // output : 5 loose the point values

        int num = 257;
        byte k = (byte)num;

        byte num1 = 10;
        byte num2 = 30;

        int result = num1 * num2; // type promoting

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(k);
        System.out.println(result);
    }
}
