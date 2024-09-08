/*
**  브론즈2
**  접근법: 역순하는 기능을 순수 구현해 보았다.
**  역순방법: 배열에 첫번 째 값과 마지막 값을 교환한다. 마지막 인덱스를 가르키는 key값을 1 감소시킨다.  
**            반복문으로 인해 다음 값과 마지막-1 값을 교환한다 이 순서를 바꾸자하고픈 값의 구간/2 반복한다.
*/
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
