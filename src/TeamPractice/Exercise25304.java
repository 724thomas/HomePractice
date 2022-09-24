package TeamPractice;

import java.util.Scanner;

public class Exercise25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice=sc.nextInt();
        int numProducts=sc.nextInt();
        int total=0;
        int price=0;
        int quantity=0;

        for ( int i=1; i<=numProducts; i++){
            price = sc.nextInt();
            quantity = sc.nextInt();
            total+= ( price*quantity );
        }
        if (totalPrice==total) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
