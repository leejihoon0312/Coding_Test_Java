package 단계별문제.Bronze;


import java.util.*;
import java.io.*;

public class B1_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringBuilder sb = new StringBuilder();
        Map<Character, Integer> dic = new HashMap<>();
        char[] arr = br.readLine().toUpperCase().toCharArray();
        String result = "?";
        int max = 0;

        for(char word : arr){
            if (dic.containsKey(word)){
                dic.put(word, dic.get(word)+1);
            }else{
                dic.put(word, 1);
            }
        }

        for (char word : dic.keySet()){
            if (max<dic.get(word)){
                max = dic.get(word);
                result = String.valueOf(word);
            }else if(max==dic.get(word)){
                result = "?";
            }
        }

        System.out.println(result);


    }
}
