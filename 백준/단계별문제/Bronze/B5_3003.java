package 단계별문제.Bronze;


import java.util.*;
import java.io.*;

public class B5_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int[] setting = {1,1,2,2,2,8};

        int idx = 0;
        while(st.hasMoreTokens()){
            sb.append((setting[idx] - Integer.parseInt(st.nextToken())) + " ");
            idx++;
        }

        System.out.print(sb.toString());
    }
}
