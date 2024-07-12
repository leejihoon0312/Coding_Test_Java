package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_2884 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();

        StringTokenizer st = new StringTokenizer(time, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        if (m>=45){
            System.out.printf("%d %d",h,m-45);
        }else if(h>0){
            System.out.printf("%d %d",h-1,(m+60)-45);
        }else{
            System.out.printf("%d %d",23,(m+60)-45);
        }


    }
}
