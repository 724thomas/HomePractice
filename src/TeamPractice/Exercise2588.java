package TeamPractice;

import java.util.Scanner;

public class Exercise2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        System.out.println( Integer.valueOf(num1) * Integer.valueOf( num2.charAt(2) -48 )  ); //아스키코드-> -48
        System.out.println( Integer.valueOf(num1) * Integer.valueOf( num2.charAt(1) -48 )  );
        System.out.println( Integer.valueOf(num1) * Integer.valueOf( num2.charAt(0) -48 )  );
        System.out.println(Integer.valueOf( num1.charAt(0) -48 )  );

    }
}
