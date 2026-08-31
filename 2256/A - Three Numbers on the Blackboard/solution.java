import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class AThreeNumbersOnTheBlackboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            
            long[] arr = new long[3];
            arr[0] = Long.parseLong(st.nextToken());
            arr[1] = Long.parseLong(st.nextToken());
            arr[2] = Long.parseLong(st.nextToken());
            
            Arrays.sort(arr);
            
            while (arr[2] > arr[0] + arr[1]) {
                arr[2] = arr[0] + arr[1];
                Arrays.sort(arr);
            }
            
            long range = arr[2] - arr[0];
            sb.append(range).append("
");
        }
        
        System.out.print(sb);
    }
}