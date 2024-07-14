package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max = 0;
        int result = 0;

        for(int i=0;i<9;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }


        for(int i =0; i<arr.size(); i++){
            if (arr.get(i) >max){
                max = arr.get(i);
                result = i+1;
            }
        }

        bw.write(String.valueOf((max)));
        bw.newLine();
        bw.write(String.valueOf((result)));
        bw.flush();
        bw.close();
    }
}
