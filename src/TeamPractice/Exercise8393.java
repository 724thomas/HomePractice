package TeamPractice;

import java.util.Scanner;

public class Exercise8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        for ( int i=1; i<=num; i++){
            ans+=i;
        }
        System.out.println(ans);
    }
}
