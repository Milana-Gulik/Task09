import java.util.Scanner;

public class Task09 {

    public static int findTheAmountOfTime(int hours, int minutes) {

        int allSeconds = 86400;

        hours = allSeconds / 3600;
        minutes = allSeconds / 60;

        return hours & minutes;
    }

    public static int inputDataTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int allSeconds = scanner.nextInt();

            return allSeconds;
    }


    public static void main(String[] args) {

        int allSeconds = inputDataTime();

        int hours = allSeconds / 3600;
        int minutes = allSeconds / 60;
        int seconds = allSeconds % 60;

        int result = findTheAmountOfTime(hours, minutes);

        String msg = "Since the beginning of the day has passed " + Math.round(hours) + " hours.\n";
        String msg1 = "Since the beginning of the day has passed " + Math.round(minutes) + " minutes.\n";
        System.out.println(msg + msg1);


    }

}


