import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int totalBaskets = Integer.parseInt(st.nextToken());
        int reverseCount = Integer.parseInt(st.nextToken());

        int[] baskets = new int[totalBaskets];
        for (int i = 1; i <= baskets.length; i++) {
            baskets[i - 1] = i;
        }

        for (int i = 0; i < reverseCount; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int firstTarget = Integer.parseInt(st2.nextToken()) - 1;
            int lasTarget = Integer.parseInt(st2.nextToken()) - 1;

            for (int j = firstTarget; j < lasTarget; j++) {
                int tmp = baskets[j];
                baskets[j] = baskets[lasTarget];
                baskets[lasTarget] = tmp;
                lasTarget--;
            }
        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
