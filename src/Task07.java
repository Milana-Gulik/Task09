import java.time.Duration;
import java.time.LocalDateTime;

public class Task07 {
    private static final LocalDateTime START = LocalDateTime.now();
    private static final LocalDateTime FINISH = LocalDateTime.parse("2022-09-21T00:00:00");

    public static void main(String[] args) {

        Duration between = Duration.between(START, FINISH).abs();
        System.out.println("Passed " + between.getSeconds() + " seconds");

    }
}
