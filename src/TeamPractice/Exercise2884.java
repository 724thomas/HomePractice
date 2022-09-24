package TeamPractice;

import java.util.Scanner;

public class Exercise2884 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hour = sc.nextInt();
        int minite = sc.nextInt()-45;
        System.out.println(minite);
        if(minite<45){
            minite+=60;
            hour--;
            if(hour<0){
                hour+=24;
            }
        }
        System.out.println(hour + " " + minite);
    }
}
