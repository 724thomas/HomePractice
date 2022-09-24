package TeamPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String temp = bf.readLine(); //java.io.IOException; 예외처리
        int repeat = Integer.parseInt(temp);
        int num1;
        int num2;
        for (int i=1; i<=repeat; i++){
            temp = bf.readLine(); //java.io.IOException; 예외처리
            StringTokenizer st = new StringTokenizer(temp);
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            System.out.println(num1+num2);
        }
    }
}
