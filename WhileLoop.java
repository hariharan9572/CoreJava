public class WhileLoop{
    public static void main(Strings[] args) {
        int i = 0;

        while(i<5){
            System.out.println("Hi"+","+i);
            int j=0;
            while(j<3){
                System.out.println("Hello"+","+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye"+","+i);
    }
}