package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B2_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        HashMap<Integer, Boolean> dic = new HashMap<>();

        for(int i =0; i<10;i++){
            int key = Integer.parseInt(br.readLine());
            dic.put(key%42,true);

        }

        bw.write(String.valueOf(dic.keySet().size()));
        bw.flush();
        bw.close();
    }

}
