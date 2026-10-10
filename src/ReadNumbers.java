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
        System.out.println("Press R for Multiplication");


        ReadNumbers readNumbers = new ReadNumbers();
        String input = sc.next();

        if(input.toUpperCase().equals("A"))System.out.println(readNumbers.sumNumbers(a,b));
        if(input.toUpperCase().equals("S"))System.out.println(readNumbers.subtraction(a,b));
        if(input.toUpperCase().equals("D"))System.out.println(readNumbers.division(a,b));
        if(input.toUpperCase().equals("M"))System.out.println(readNumbers.multiplication(a,b));
        if(input.toUpperCase().equals("R"))System.out.println(readNumbers.isOddOrEven(a,b));
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
    String isOddOrEven(int a,int b){
        String response = (a % b == 0) ? "Even" : "Odd";
        return response;
    }
}
class GradeCalculator{
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = sc.nextInt();

        char grade = switch (score / 10){
            case 10,9,8 ->'A';
            case 7,6 -> 'B';
            case 5 -> 'C';
            default -> 'F';

        };
        System.out.println(grade);
    }
}
