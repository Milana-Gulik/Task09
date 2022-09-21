public class Task05 {
    public static boolean checkEvenNumbers(int a, int b, int c) {

        if (a % 2 == 0) {
            return true;
        } else if (b % 2 == 0) {
            return true;
        } else if (c % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {

        if (a % 2 != 0) {
            return true;
        } else if (b % 2 != 0) {
            return true;
        } else if (c % 2 != 0) {
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        int a = Task01.inputPositiveNumber();
        int b = Task01.inputPositiveNumber();
        int c = Task01.inputPositiveNumber();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = result ? "Yes, at least one number is even."
                : "No,  at least one number isn't even.";

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = result ? "Yes, at least one number is odd."
                : "No, at least one number isn't odd.";

        System.out.println(msg);

    }
}