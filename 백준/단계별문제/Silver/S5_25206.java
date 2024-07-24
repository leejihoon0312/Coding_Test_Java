package 단계별문제.Silver;


import java.util.*;
import java.io.*;

public class S5_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();
        Double credit_sum = 0.0;
        Double major_sum = 0.0;
        String line;

        while((line = br.readLine()) != null){
            st = new StringTokenizer(line," ");
            String name = st.nextToken();
            String credit = st.nextToken();
            String score = st.nextToken();

            switch(score){
                case "A+":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 4.5;
                    break;
                case "A0":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 4.0;
                    break;
                case "B+":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 3.5;
                    break;
                case "B0":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 3.0;
                    break;
                case "C+":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 2.5;
                    break;
                case "C0":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 2.0;
                    break;
                case "D+":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 1.5;
                    break;
                case "D0":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 1.0;
                    break;
                case "F":
                    credit_sum += Double.parseDouble(credit);
                    major_sum += Double.parseDouble(credit) * 0.0;
                    break;
            }

        }
        System.out.printf("%.6f",major_sum/credit_sum);

    }
}
