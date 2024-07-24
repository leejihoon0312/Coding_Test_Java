package 단계별문제.Silver;


import java.util.*;
import java.io.*;

public class S5_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringBuilder sb = new StringBuilder();
        Map<Character, Integer> dic = new HashMap<>();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();

        for(String croatia : arr){
            word = word.replace(croatia, "*");
        }

        System.out.println(word.length());


    }
}
