package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B4_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int check = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i =1; i<=check; i++){

            String product = br.readLine();
            StringTokenizer st = new StringTokenizer(product, " ");
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            sum += price*num;

        }

        String result = (total==sum) ? "Yes" : "No";
        System.out.println(result);
    }
}
