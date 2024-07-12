package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String time = br.readLine();

        StringTokenizer st = new StringTokenizer(time, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int take = Integer.parseInt(br.readLine());

        if ((m+take)<60){
            System.out.printf("%d %d",h,m+take);
        }else{
            int add_h = h+((m+take)/60);
            if(add_h>23){
                add_h = add_h%24;
            }
            System.out.printf("%d %d",add_h,(m+take)%60);
        }

    }
}
