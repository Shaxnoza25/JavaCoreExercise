package Integer;

import java.util.Scanner;

public class Integer20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many seconds passed from beginning of the day: ");
        int seconds= input.nextInt();
        int hours=seconds/360;
        System.out.println(hours+" hours passed");
    }
}