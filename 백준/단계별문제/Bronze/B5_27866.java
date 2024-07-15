package 단계별문제.Bronze;

import java.util.*;
import java.io.*;
public class B5_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        char[] arr = br.readLine().toCharArray();
        int idx = Integer.parseInt(br.readLine());

        bw.write(arr[idx-1]);
        bw.flush();
        bw.close();


    }
}
