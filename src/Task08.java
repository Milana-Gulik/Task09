import java.util.Scanner;
public class Task08 {

    public static String determineTheNumberOfTheDayOfTheWeek(int dayOfTheWeek) {
        StringBuilder msg = new StringBuilder();
        int day = dayOfTheWeek % 7;

        if (dayOfTheWeek <= 365) {
            while (dayOfTheWeek > 7) {
                dayOfTheWeek -= 7;
            }

        } else {
            System.out.println("Error! 365 days!");
        }

        String feedback = "Error";

        switch (dayOfTheWeek) {
            case 0: feedback = "Monday"; break;
            case 1: feedback = "Tuesday"; break;
            case 2: feedback = "Wednesday"; break;
            case 3: feedback = "Thursday"; break;
            case 4: feedback = "Friday"; break;
            case 5: feedback = "Saturday"; break;
            case 6: feedback = "Sunday"; break;
        }
        return feedback;

    }


    public static String determinateMonth(int startMonth) {

        String msg = "Error!";

        if (startMonth >= 1 && startMonth <= 12) {
            switch (startMonth){
                case 1:
                case 10: msg = "Saturday";
                case 2:
                case 3:
                case 11: msg = "Tuesday";
                case 4:
                case 7: msg = "Friday";
                case 5: msg = "Sunday";
                case 6: msg = "Wednesday";
                case 8: msg = "Monday";
                case 9:
                case 12: msg = "Thursday";
            }
    } else {
            System.out.println("Error!");
        }
        return msg;
}

    public static int printNumberOfDays(int month) {

        String msg = "";


        if (month >= 1 && month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    msg = "31 Days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    msg = "30 Days";
                    break;
                case 2:
                    msg = "28 Days";
                    break;
                default:
                    msg = "Invalid month!";
                    break;

            }
        } else
            msg = "Invalid month!";
        return month;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the day of the year: ");
        int day = scanner.nextInt();
        System.out.print("Input the month: ");
        int month = scanner.nextInt();


        int dayOfTheWeek = printNumberOfDays(month);

        String result = determineTheNumberOfTheDayOfTheWeek(dayOfTheWeek);

        String msg = "Day of the week is " + determineTheNumberOfTheDayOfTheWeek(dayOfTheWeek) + ".";

        System.out.println(msg);

    }
}