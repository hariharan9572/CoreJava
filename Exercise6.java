public class Exercise6 {
    public static void main(Strings[] args) {
        
        int numbers[] = {45, 22, 89, 16, 90, 33};
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i=0; i < numbers.length;i++){
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        
        System.out.println("Smallest: "+min);
        System.out.println("Largest: "+max);
        
    }
}
