package Refactoring.tach.bien;

public class FizzBuzz {

    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;

    public static String fizzBuzz(int number){
        boolean isFizz = number % FIZZ_NUMBER == 0;
        boolean isBuzz = number % BUZZ_NUMBER == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
