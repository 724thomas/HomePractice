package TeamPractice;

import java.util.Scanner;

public class Exercise14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("x를 입력해주세요.");
        float num1=sc.nextFloat();
        System.out.println("y를 입력해주세요.");
        float num2=sc.nextFloat();

        int num3 = Float.floatToIntBits(num1);
        int num4 = Float.floatToIntBits(num2);

        int num5 = (-num3>>>31)-(num3>>>31);
        int num6 = (-num4>>>31)-(num4>>>31);

        if(num1>0){
            System.out.println((int)( (num5 * 2.5) - (num6 * 1.5) ));
        }else{
            System.out.println((int)( (num5 * -2.5) - (num6 * 0.5) ));
        //x=y^2
        }
        //System.out.println(
        //        (num1==0) ? ( (num2==0) ? "원점" : "x 축 위에 있음.") : ( (num2==0) ? "y 축 위에 있음." : (num1>0) ? ( (num2>0) ? "제 1사분면" : "제 4사분면" ) : ( (num2>0) ? "제 2사분면" : "제 3사분면" ) ) );
    }
}
