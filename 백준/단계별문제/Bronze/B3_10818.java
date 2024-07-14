package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];



        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int idx = 0;
        while(st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        int min = arr[0];
        int max = arr[0];

        for(int num:arr){
            if (num<min){min = num;}
            if (num>max){max = num;}
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
