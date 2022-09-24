package TeamPractice;

import java.util.Scanner;

public class Exercise2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(year<1 || year>4000){
            System.out.println("다시 입력해주세요. (1~4000)");
            year = sc.nextInt();
        }
        int tf = ((year%4==0 && year%100!=0) || year%400==0) ? 1 : 0;
        System.out.println(tf);
    }
}
