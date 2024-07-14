package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int bowl_cnt = Integer.parseInt(st.nextToken());
        int[] arr = new int[bowl_cnt];
        int loop = Integer.parseInt(st.nextToken());

        for (int i =0; i<loop; i++){
            st = new StringTokenizer(br.readLine()," ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            for(int j = from-1; j<=to-1;j++){
                arr[j] = number;
            }
        }

        for (int num:arr){
            bw.write(String.valueOf(num) +" ");
        }
        bw.flush();
        bw.close();


    }
}
