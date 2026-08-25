import java.util.Arrays;
import java.util.Scanner;
 
public class ASpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String target = "Timru"; 
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            
            while (t-- > 0) {
                int n = sc.nextInt(); 
                String s = sc.next(); 
                if (n != 5) {
                    System.out.println("NO");
                    continue;
                }
                
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String sortedStr = new String(chars);
                
                if (sortedStr.equals(target)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}