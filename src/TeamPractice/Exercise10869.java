package TeamPractice;

import java.util.Scanner;

public class Exercise10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요. (1~9) : ");
        double num1 = sc.nextInt();
        while (num1<=0 || num1>=10){
            System.out.println("잘못된 숫자입니다. 1~9까지 입력해주세요.");
            num1 = sc.nextInt();
        }
        System.out.print("첫번째 숫자를 입력해주세요. (1~9) : ");
        double num2 = sc.nextInt();
        while (num2<=0 || num2>=10){
            System.out.println("잘못된 숫자입니다. 1~9까지 입력해주세요.");
            num2 = sc.nextInt();
        }
        System.out.println("두 수의 합은 : " +( num1+num2) + "입니다.");
        System.out.println("두 수의 차는 : " +( num1-num2) + "입니다.");
        System.out.println("두 수의 곱은 : " +( num1*num2) + "입니다.");
        System.out.println("두 수의 나눗셈은 : " +( num1/num2) + "입니다.");
        System.out.println("두 수의 나눗셈의 나머지는 : " +( num1%num2) + "입니다.");
    }
}
