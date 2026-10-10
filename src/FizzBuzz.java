public class FizzBuzz {
    static void main(){
        System.out.println(FizzBuzz.checker(3,5,7,9,11,15,30));
    }
   static String checker (int... numbers) {
        String result ="";
        for(int num : numbers){
            if(num % 3 == 0 && num % 5 == 0){
                result += " FizzBuzz ";
            } else if (num % 5 == 0) {
                result += " Buzz ";
            } else if (num % 3 == 0 ) {
                result += " Fizz ";
            }
            else {
                result += num;
            }
        }
        return result;
    }
}
