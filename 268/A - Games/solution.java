import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] homeColor = new int[n];
        int[] awayColor = new int[n];
        
        for (int i = 0; i < n; i++) {
            homeColor[i] = in.nextInt();
            awayColor[i] = in.nextInt();
        }
        
        int conflictCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && homeColor[i] == awayColor[j]) {
                    conflictCount++;
                }
            }
        }
        
        System.out.println(conflictCount);
        
    
    }
}