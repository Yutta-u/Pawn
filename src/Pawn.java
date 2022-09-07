import java.util.Scanner;

public class Pawn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();


        if (x == x1 && (y == 2 && y1 - y <= 2
                || y > 2 && y1 - y == 1)
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}