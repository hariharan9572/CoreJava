import java.util.Scanner;

public class Exercise5 {
    public static void main(Strings[] args) {
        Scanner input = new Scanner(System.in);
        Strings again = "y";

        while(again.equalsIgnoreCase("y")){
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();
            
            System.out.print("Choose operation (+, -, *, /): ");
            char op = input.next().charAt(0);
            
            
            if(op == '+'){
                System.out.println("Result: "+ (num1+num2));
            }else if (op == '-'){
                System.out.println("Result: "+ (num1-num2));
            }else if (op == '*'){
                System.out.println("Result: "+ (num1*num2));
            }
            else if (op == '/'){
                if (num2==0){
                    System.out.println("Cannot divide by zero.");
                }else{
                    System.out.println("Result: "+ (num1/num2));
                }
            }
            else{
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
            }
            
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }
        
        System.out.println("Thank you for using the calculator.");
        input.close();
    }
}