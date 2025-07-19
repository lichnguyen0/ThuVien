package fizzbuzz;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Chỉ hỗ trợ số từ 1 đến 99");
        }

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        StringBuilder result = new StringBuilder();

        if (divisibleBy3 || contains3) {
            result.append("Fizz");
        }

        if (divisibleBy5 || contains5) {
            result.append("Buzz");
        }

        if (result.length() > 0) {
            return result.toString();
        }

        return numberToVietnamese(number);
    }

    private static String numberToVietnamese(int number) {
        String[] words = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number < 10) {
            return words[number];
        }

        int tens = number / 10;
        int units = number % 10;

        return words[tens] + " " + words[units];
    }
}
