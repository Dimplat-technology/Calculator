import java.util.Scanner;

public class ReadNumbers {
    static void main(){

        System.out.println("Enter first Numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter sec number ");
        int b = sc.nextInt();

        System.out.println("Press A for add");
        System.out.println("Press S for Subtraction");
        System.out.println("Press D for Division");
        System.out.println("Press M for Multiplication");


        ReadNumbers readNumbers = new ReadNumbers();
        String input = sc.next();

        if(input.toUpperCase().equals("A"))System.out.println(readNumbers.sumNumbers(a,b));
        if(input.toUpperCase().equals("S"))System.out.println(readNumbers.subtraction(a,b));
        if(input.toUpperCase().equals("D"))System.out.println(readNumbers.division(a,b));
        if(input.toUpperCase().equals("M"))System.out.println(readNumbers.multiplication(a,b));
    }
    int sumNumbers(int a, int b){
        return a + b;
    }
    int subtraction(int a, int b){
        return a - b;
    }
    int multiplication(int a, int b){
        return a * b;
    }
    int division(int a, int b){
        return a / b;
    }
}
