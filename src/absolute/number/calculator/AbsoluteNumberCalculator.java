package absolute.number.calculator;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        // Sử dụng thư viện Java sẵn có để lấy giá trị tuyệt đối
        return Math.abs(number);

        // Hoặc tự viết thủ công:
        // if (number < 0) return -number;
        // return number;
    }
}
