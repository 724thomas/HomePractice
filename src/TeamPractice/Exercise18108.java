package TeamPractice;

import java.util.Scanner;

public class Exercise18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt()-544;
        if (year>=0){
            System.out.println("AD " + year);
        }else{
            System.out.println(-year+" BC");
        }
    }
}
