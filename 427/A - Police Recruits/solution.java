import java.util.Scanner;
 
public class APoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int policeOfficers = 0;
        int untreatedCrimes = 0;
        
        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();
            
            if (event > 0) {
                policeOfficers += event;
            } else {
                if (policeOfficers > 0) {
                    policeOfficers--;
                } else {
                    untreatedCrimes++; 
                }
            }
        }
        
        System.out.println(untreatedCrimes);
        scanner.close();
    }
}