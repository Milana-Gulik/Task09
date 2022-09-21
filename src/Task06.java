public class Task06 {

    public static boolean checkEvenNumbers(int a, int b, int c) {
        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0) ||
                (b % 2 == 0 && c % 2 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {
        if ((a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && c % 2 != 0) ||
                (b % 2 != 0 && c % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = Task01.inputPositiveNumber();
        int b = Task01.inputPositiveNumber();
        int c = Task01.inputPositiveNumber();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = result ? "Yes, most numbers are even."
                : "No, most numbers aren't even";

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = result ? "Yes, some numbers are odd."
                : "No, some numbers aren't odd";

        System.out.println(msg);

    }
}
