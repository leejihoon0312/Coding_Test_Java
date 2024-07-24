package 단계별문제.Silver;


import java.util.*;
import java.io.*;

public class S5_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringBuilder sb = new StringBuilder();
        Map<Character, Boolean> dic = new HashMap<>();
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        boolean flag;

        for (int loop=0; loop<count; loop++){

            char[] arr = br.readLine().toCharArray();
            flag = true;

            for(int i =0; i<arr.length;i++){
                if (dic.containsKey(arr[i])){
                    if (arr[i] != arr[i-1]){
                        flag = false;
                        break;
                    }
                }else{
                    dic.put(arr[i], true);
                }
            }

            if(flag){
                result += 1;
            }
            dic.clear();
        }

        System.out.println(result);

    }
}
