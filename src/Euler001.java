import java.io.*;
import java.util.stream.*;

public class Euler001 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                long range = (n-1)/3 + 1;
                long sum = (range * (range-1) * 3)/2;
                range = (n-1)/5 + 1;
                sum += (range * (range-1) * 5)/2;
                range = (n-1)/15 + 1;
                sum -= (range * (range-1) * 15)/2;
                System.out.println(sum);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
