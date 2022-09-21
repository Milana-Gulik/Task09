import java.util.Scanner;

public class Task02 {

    public static boolean findPoint(int x, int y, int x1, int y1, int x2, int y2) {

        if ((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input coordinate x: ");
        int x = scanner.nextInt();

        System.out.print("Input coordinate y: ");
        int y = scanner.nextInt();

        int x1 = 0, y1 = 0, x2 = 15, y2 = 12;

        boolean result = findPoint(x, y, x1, y1, x2, y2);

        String msg = result ? "Yes, this point is located inside " +
                "the rectangle" : "No, this point isn't located inside" +
                " the rectangle ";

        System.out.println(msg);

    }

}
