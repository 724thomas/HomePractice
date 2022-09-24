package TeamPractice;

import java.util.Scanner;

public class Exercise9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while (num1<0 || num1>100){
            System.out.println("0~100점수만 입력 가능합니다. 다시 입력해주세요.");
            num1 = sc.nextInt();
        }
        String grade = (num1>=90) ? "A" : (num1>=80) ? "B" : (num1>=70) ? "C" : (num1>=60) ? "D" : "F" ;
        System.out.println(grade);
    }
}
