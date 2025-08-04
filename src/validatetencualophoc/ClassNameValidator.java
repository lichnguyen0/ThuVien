package validatetencualophoc;

public class ClassNameValidator {

    public static boolean isValidClassName(String className) {

        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        // Test thử
        String[] testCases = {
                "C0223G",
                "A0323K",
                "M0318G",
                "P0323A",
                "P1234I",
                "C12#3G"
        };

        for (String className : testCases) {
            System.out.printf("Tên lớp '%s' hợp lệ? %s%n",
                    className, isValidClassName(className) ? "Có" : "Không");
        }
    }
}

