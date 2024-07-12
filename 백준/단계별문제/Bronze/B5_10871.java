package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B5_10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String condition = br.readLine();
        StringTokenizer st = new StringTokenizer(condition, " ");
        int size = Integer.parseInt(st.nextToken());
        int max_num = Integer.parseInt(st.nextToken());
        List<Integer> array = new ArrayList<Integer>();

        String arr = br.readLine();
        StringTokenizer arr_st = new StringTokenizer(arr, " ");
        for (int i =0; i<size; i++){
            int num = Integer.parseInt(arr_st.nextToken());
            if (num<max_num){
                array.add(num);
            }
        }

        for (int result:array){
            bw.write(result +" ");
        }

        bw.flush();
        bw.close();


    }
}
