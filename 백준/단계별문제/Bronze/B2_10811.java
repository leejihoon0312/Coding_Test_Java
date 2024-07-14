package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B2_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<Integer> arr = new ArrayList<>();
        int size = Integer.parseInt(st.nextToken());
        int loop = Integer.parseInt(st.nextToken());



        for (int i = 0; i < size; i++) {
            arr.add(i+1);
        }


        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            Collections.reverse(arr.subList(from-1,to));
        }

        for (int num : arr){
            System.out.print(num +" ");
        }
    }
}
