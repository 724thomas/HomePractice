package TeamPractice;


import java.util.Scanner;

public class Exercise10950 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int repeat=sc.nextInt();
        int num1;
        int num2;
        for ( int i=1 ; i<=repeat ; i++){
            num1=sc.nextInt();
            num2=sc.nextInt();
            System.out.println(num1+num2);
        }
    }
}
