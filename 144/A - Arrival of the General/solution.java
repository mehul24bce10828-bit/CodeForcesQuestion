import java.util.Scanner;
 
public class AArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            
            if (height > maxVal) {
                maxVal = height;
                maxIndex = i;
            }
            
            if (height <= minVal) {
                minVal = height;
                minIndex = i;
            }
        }
        
        int totalSwaps = maxIndex + (n - 1 - minIndex);
        
        if (maxIndex > minIndex) {
            totalSwaps--;
        }
        
        System.out.println(totalSwaps);
        sc.close();
    }
}