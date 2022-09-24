package TeamPractice;

import java.util.Scanner;

public class Exercise1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while (num1<-10000 || num1>10000){
            System.out.println("잘못된 숫자입니다. 다시 입력해주세요. (-10,000 ≤ 숫자 ≤ 10,000");
            num1 = sc.nextInt();
        }
        int num2 = sc.nextInt();
        while (num2<-10000 || num2>10000) {
            System.out.println("잘못된 숫자입니다. 다시 입력해주세요. (-10,000 ≤ 숫자 ≤ 10,000");
            num2 = sc.nextInt();
        }

        if (num1>num2){
            System.out.println(">");
        } else if ((num2>num1)) {
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
