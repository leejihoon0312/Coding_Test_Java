package 단계별문제.Bronze;

import java.util.*;
import java.io.*;

public class B3_2588 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        String num = Integer.toString(b);

        System.out.println(a * Character.getNumericValue(num.charAt(2)));
        System.out.println(a * Character.getNumericValue(num.charAt(1)));
        System.out.println(a * Character.getNumericValue(num.charAt(0)));
        System.out.println(a * b);


    }
}
