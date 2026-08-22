import java.util.Scanner;
 
public class AFoxAndSnake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
            } else {
                if (i % 4 == 2) {
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}