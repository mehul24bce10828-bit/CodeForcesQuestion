import java.util.Scanner;
 
public class  BBlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int maxZeros = 0;
            int currentZeros = 0;
            
            for (int i = 0; i < n; i++) {
                int element = sc.nextInt();
                
                if (element == 0) {
                    currentZeros++;
                    maxZeros = Math.max(maxZeros, currentZeros);
                } else {
                    currentZeros = 0;
                }
            }
            
            System.out.println(maxZeros);
        }
        
        sc.close();
    }
}