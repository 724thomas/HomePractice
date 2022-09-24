package TeamPractice;

import java.util.Scanner;

public class Exercise3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //킹 퀸 룩 비숍 나이트 폰
        //1  1  2  2  2     8
        String[] intSplit1 = sc.nextLine().split(" ");
        System.out.println(
                (1-(Integer.valueOf(intSplit1[0])))+ " " +
                (1-(Integer.valueOf(intSplit1[1])))+ " " +
                (2-(Integer.valueOf(intSplit1[2])))+ " " +
                (2-(Integer.valueOf(intSplit1[3])))+ " " +
                (2-(Integer.valueOf(intSplit1[4])))+ " " +
                (8-(Integer.valueOf(intSplit1[5])))
        );
        //https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/ int -> String
    }
}
