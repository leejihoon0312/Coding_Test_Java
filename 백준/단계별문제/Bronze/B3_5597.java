package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        boolean[] arr = new boolean[30];

        for(int i=0; i<30; i++){
            arr[i] = false;
        }

        for(int i=0; i<28; i++){
            arr[Integer.parseInt(br.readLine())-1] = true;
        }

        for(int i=0; i<30; i++){
            if (arr[i] == false){System.out.println(i+1);}
        }
    }
}
