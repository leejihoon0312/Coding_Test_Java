package 단계별문제.Bronze;

import java.util.*;
import java.io.*;
public class B2_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder(st.nextToken());
        int num1 = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuilder(st.nextToken());
        int num2 = Integer.parseInt(sb.reverse().toString());
        int result = (num1>num2) ? num1 : num2;
        System.out.print(result);
    }
}
