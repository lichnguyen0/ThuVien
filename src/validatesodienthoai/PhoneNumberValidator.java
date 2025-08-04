package validatesodienthoai;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {

        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        // Một số test case
        String[] testCases = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(01)-(0123456789)",
                "(84)-0978489648"
        };

        for (String number : testCases) {
            System.out.printf("Số '%s' hợp lệ? %s%n",
                    number, isValidPhoneNumber(number) ? "Có" : "Không");
        }
    }
}

